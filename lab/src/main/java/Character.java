public class Character {
    public int power;
    public int hp;
    public String type;

    public Character(int power, int hp, String type) {
        this.power = power;
        this.hp = hp;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getPower() {
        return power;
    }
    public void setPower(int value){
        this.power = value;
    }

    public int getHp() {
        return hp;
    }
    public void setHp(int value){
        this.hp = value;
    }

    public void kick(Character c){

    }
    public boolean isAlive(){
        return hp > 0;
    }
}
