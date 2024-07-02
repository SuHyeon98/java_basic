package phone;

public class Person {

    private String name;
    private Phone phone;

    public Person(String name, Phone phone){
        this.name = name;
        this.phone = phone;
    }


    public String getName() {
        return name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void phonePowerOn() {
        phone.powerOn();
    }

    public void watchYoutube() {
        phone.watchYoutube();
    }

    public void phonePowerOff() {
        phone.powerOff();
    }
}
