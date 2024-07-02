package Student;

public class Taxi {
    private String company;
    private int passengerCount;
    private int price;

    public Taxi(){}
    public Taxi(String company) {
        this.company = company;
    }

    public void take(int price) {
        this.price += price;
        passengerCount++;
    }

    public void showBusInfo() {
        System.out.println(company + "회사 택시 / 승객 수 : " + passengerCount + " / 수입 : " + price);
    }
}
