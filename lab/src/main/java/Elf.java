public class Elf extends Character{
    public Elf(){
        super(10, 10, "Ельф");
    }

    public void kick(Character c) {
        if(c.power < this.power){
            c.setHp(0);
        }else{
            c.setHp(c.getHp()-1);
        }
    }
}
