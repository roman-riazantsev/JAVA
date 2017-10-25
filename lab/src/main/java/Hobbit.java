public class Hobbit extends Character{
    public Hobbit(){
        super(0, 3, "Хоббит");
    }

    public void kick(Character c) {
        toCry();
    }

    public void toCry(){
        System.out.println("Подождем пока Гендальф об этом узнает, говорит Хоббит");
    }
}
