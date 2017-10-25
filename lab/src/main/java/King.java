import java.util.Random;

public class King extends Character{
    public King(){
        super(new Random().nextInt(15) + 5,new Random().nextInt(15) + 5, "Король");
    }

    public void kick(Character c) {
        c.setHp(c.getHp() - this.power);
    }

}
