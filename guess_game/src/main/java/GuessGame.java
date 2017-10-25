import javax.swing.*;
import java.util.Random;

public class GuessGame {
    static int cluesCount = 1;
    static int maxNum = 40;
    static JFrame frame = new JFrame("InputDialog");

    public void play(int max){
        maxNum = max;
        cluesCount = 1;

        Random rand = new Random();

        int numToGuess = rand.nextInt(max-1) + 1;
        System.out.println(numToGuess);

        while (true){
            int clue = Integer.parseInt(JOptionPane.showInputDialog(frame, "какое число я загадал?"));
            System.out.println(cluesCount);
            if (clue ==  numToGuess){
                JOptionPane.showMessageDialog(frame, "Невероятно! Я действительно загадал " + numToGuess);
                break;
            }else if(clue > numToGuess){
                cluesCount++;
                JOptionPane.showMessageDialog(frame, "Изи, возьми меньше)");
            }else if(clue < numToGuess){
                cluesCount++;
                JOptionPane.showMessageDialog(frame, "Как-то скромно, мое число больше)");
            }
        }
    }

    public static void printBestScore(){
        int bestScore = 1;
        int score = (maxNum/ cluesCount);

        if(bestScore < score){
            bestScore = score;
        }
        JOptionPane.showMessageDialog(frame, "Лучший счет: " + bestScore);
    }
}
