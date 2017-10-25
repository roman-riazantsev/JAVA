import java.util.Random;

public class CharacterFactory{
    public static Character createCharacter(){
        Random rand = new Random();
        int randNum = rand.nextInt(4);

        if(randNum == 0){
            return new Hobbit();
        }else if(randNum == 1) {
            return new Elf();
        }else if(randNum == 2){
            return new King();
        }else {
            return new Knight();
        }
    }
}
