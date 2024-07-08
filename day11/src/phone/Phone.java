package phone;

public interface Phone {

    public static final int MAX_BATTERY = 100;

    abstract void openingLogo();
    abstract void powerOn();
    abstract void powerOff();
    abstract void charge();

    abstract Boolean isOn();
    abstract void watchYouTube();
}
