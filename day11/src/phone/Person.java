package phone;

public class Person {

    Phone phone;

    public Person(Phone phone) {
        this.phone = phone;
    }

    public void buyNewPhone(Phone phone) {
        this.phone = phone;
        System.out.println("----------새 폰 구입----------");
    }

    public void turnOn() {
        phone.powerOn();
    }

    public void turnOff() {
        phone.powerOff();
    }

    public void watchYoutube() {
        if(phone.isOn()) {
            phone.watchYouTube();
        }else {
            System.out.println("전원이 꺼져 있습니다.");
        }
    }

    void chargingPhone() {
        phone.charge();
    }

}
