package phone;

public class main {
    public static void main(String[] args) {
        Phone myPhone = new Phone("010-1111-2222");
        Person me = new Person("홍길동", myPhone);

        me.phonePowerOn();
        me.watchYoutube();
        me.watchYoutube();
        me.watchYoutube();

        int battery = me.getPhone().getBattery();
        System.out.println(battery);

        me.phonePowerOff();
    }
}
