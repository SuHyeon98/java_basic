package Student;

public class Subway {
    private String lineNumber;
    private int passengerCount;
    private int price;

    public Subway(){}
    public Subway(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int price) {
        this.price += price;
        passengerCount++;
    }

    public void showBusInfo() {
        System.out.println(lineNumber + " 메뉴/ 고객 수 : " + passengerCount + " / 수입 : " + price);
    }
}
