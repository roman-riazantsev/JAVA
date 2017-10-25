public class GameManager {
    CharacterFactory factory = new CharacterFactory();

    Character Character1 = factory.createCharacter();
    Character Character2 = factory.createCharacter();

    public void checkCharacters(){
        while (Character1.getType() == (Character2.getType())){
            Character2 = factory.createCharacter();
        }
    }

    public void fight(){
        String trees = "\uD83C\uDF32 \uD83C\uDF32 \uD83C\uDF32 \uD83C\uDF32 \uD83C\uDF32 \uD83C\uDF32 \uD83C\uDF32 \uD83C\uDF32 \uD83C\uDF32 \uD83C\uDF32";

        System.out.println(trees);
        System.out.println("Лихолесье, Средиземье -- 3421 год Второй эпохи");
        System.out.println(trees);

        System.out.println(Character1.getType() + " замечает, как ему навстречу идет " + Character2.getType());
        System.out.println("К несчастью, путниками овладевает темная магия леса, они бросаются в бой");

        System.out.println(trees);

        while(Character1.isAlive() && Character2.isAlive()){
            Character1.kick(Character2);
            System.out.println(Character1.getType() + " наносит " + Character1.getPower() + " урона, оставляя своего соперника с " + Character2.getHp() + " единицами здоровья");

            if(!(Character1.isAlive() && Character2.isAlive())){
                break;
            }

            System.out.println(trees);

            Character2.kick(Character1);
            System.out.println(Character2.getType() + " наносит " + Character2.getPower() + " урона, оставляя своего соперника с " + Character1.getHp() + " единицами здоровья");
        }

        String winner;
        String loser;

        if(Character1.isAlive()){
            winner = Character1.getType();
            loser = Character2.getType();
        }else{
            winner = Character2.getType();
            loser = Character1.getType();
        }

        System.out.println(winner + ": боюсь, "+ loser +", сегодня не твой день");
        System.out.println(loser + " трагично погибает");
    }
}
