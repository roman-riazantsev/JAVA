import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("InputDialog");

        int max = 40;
        String notToExit = "y";

        while (notToExit.equals("y")){
            int number = Integer.parseInt(JOptionPane.showInputDialog(frame, "Как долго вы готовы играть, по шкале от 1 до 40? Больше вашего числа не загадаю))"));
            if (number < 1 || number > max) {
                notToExit = JOptionPane.showInputDialog(frame, "Не в мою смену; Нажмите y, если вспонили, что значит от 1 до 40 =)");
                if(!notToExit.equals("y")){
                    break;
                }
            }else {
                GuessGame game = new GuessGame();
                game.play(number);
                game.printBestScore();
                notToExit = JOptionPane.showInputDialog(frame, "Захватывает, правда? ну что еще разок? y/n");
            }
        }
        JOptionPane.showMessageDialog(frame, "Ну смотрите, упускаете умопомрачительный gameplay ;D");
    }
}
