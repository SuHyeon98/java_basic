import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("가격을 입력하세요 : ");
        int won = sc.nextInt();

        System.out.println("수량을 입력하세요 : ");
        int count = sc.nextInt();

        double total = won * count;
        System.out.println("총 금액은 "+ total + "입니다.");

        final double dis = 0.1;

        if (won > 10) {
            total *= (1-dis);
            System.out.println("할인되고 총 금액은 " + total + "입니다.");
        }
    }
}
