package Static;

public class Main {
    public static void main(String[] args) {
        Employee emLee = new Employee("이순신", "홍보");
        Employee emKim = new Employee("김유신", "총무");

        emLee.showInfo();
        emKim.showInfo();

        System.out.println(emLee.serialNum);
        System.out.println(emKim.serialNum);
    }

}
