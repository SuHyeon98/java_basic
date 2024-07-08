package phone;

public class Galaxy implements Phone{
    int batteryCapacity = 40;
    boolean isOn = false;

    @Override
    public void openingLogo() {
        System.out.println("Galaxy Start");
    }

    @Override
    public void powerOn() {
        if (batteryCapacity > 30) {
            System.out.println("Galaxy powerOn");
            isOn = true;
        }else {
            System.out.println("Low Battery...");
        }
    }

    @Override
    public void powerOff() {
        System.out.println("Galaxy powerOff");
        isOn = false;
    }

    @Override
    public void charge() {
        if (batteryCapacity < Phone.MAX_BATTERY - 20) {
            System.out.println("battery is charging!");
            batteryCapacity += 5;
            System.out.println("Charged..." + batteryCapacity);
        }else {
            System.out.println("Charging complete");
        }
    }

    @Override
    public Boolean isOn() {
        return isOn;
    }

    @Override
    public void watchYouTube() {
        if (batteryCapacity > 10) {
            System.out.println("---watching youtube---");
        }else {
            System.out.println("Low battery...");
            powerOff();
        }
    }
}
