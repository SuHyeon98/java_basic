package phone;

public class Test {
    public static void main(String[] args) {

        Phone apple = new Apple();
        Phone galaxy = new Galaxy();

        Person na = new Person(new Apple());

        na.turnOn();
        na.watchYoutube();
        na.turnOff();
        na.watchYoutube();

        na.buyNewPhone(new Galaxy());

        na.turnOn();
        na.watchYoutube();
        na.turnOff();
        na.watchYoutube();

    }
}
