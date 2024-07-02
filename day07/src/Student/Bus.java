package Student;

public class Bus {

    private int busNumber;
    private int passengerCount;
    private int price;

    public Bus() {}
    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int price) {
        this.price += price;
        passengerCount++;
    }

    public void showBusInfo() {
        System.out.println(busNumber + "번 번호/ 승객 수 : " + passengerCount + " / 수입 : " + price);
    }

}
