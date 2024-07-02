package phone;

public class Phone {

    private static final int MAX_BETTERY = 100;
    private String phoneNumber;
    private int battery;


    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.battery = MAX_BETTERY;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getBattery() {
        return battery;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }



    public void powerOn(){
        System.out.println("power on");
    }

    public void watchYoutube() {
        this.battery -= 10;
    }

    public void powerOff(){
        System.out.println("power off");
    }
}
