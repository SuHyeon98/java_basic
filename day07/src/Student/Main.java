package Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student stLee = School.resist("이순신", 3, 3000);
        Student Ed = new Student("Edward", 1, 20000);


        Bus bus100 = new Bus(100);
        Subway sub = new Subway("햄치즈");
        Taxi taxi = new Taxi("잘나간다 운수");

        stLee.takeBus(bus100);
        stLee.takeSubway(sub);
        Ed.takeTaxi(taxi);
        System.out.println("------------------------------");
        bus100.showBusInfo();
        sub.showBusInfo();
        taxi.showBusInfo();
        System.out.println("------------------------------");
        System.out.println(stLee);
        System.out.println(Ed);

        School school = School.getInstance();
        System.out.println();


    }
}