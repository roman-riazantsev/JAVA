import java.util.Random;

public class Knight extends Character{
    public Knight(){
        super(new Random().nextInt(12) + 2,new Random().nextInt(12) + 2, "Рыцарь");
    }

    public void kick(Character c) {
        c.setHp(c.getHp() - this.power);
    }
}
