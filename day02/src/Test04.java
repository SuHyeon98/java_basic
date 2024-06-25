import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {

        int balance = 1000;

        System.out.println("현재 잔액은 " + balance +  "원 입니다.");
        System.out.println("--------------------");


        Scanner sc = new Scanner(System.in);

        System.out.println("입금할 잔액을 입력하세요 : ");
        int plusWon = sc.nextInt();

        balance += plusWon;

        System.out.println("현재 잔액은 " + balance +  "원 입니다.");
        System.out.println("--------------------");

        System.out.println("출금할 잔액을 입력하세요 : ");
        int minusWon = sc.nextInt();

        balance -= minusWon;

        System.out.println("현재 잔액은 " + balance +  "원 입니다.");
        System.out.println("--------------------");

        // 1년 후 잔액 (연이자 2% 가정)
        balance  += balance * 0.02;
        // balance = balance + (balance * 0.02);
        System.out.println("1년 후 잔액(2%이하 적용)은 " + balance + " 원 입니다.");
        System.out.println("--------------------");
    }
}
