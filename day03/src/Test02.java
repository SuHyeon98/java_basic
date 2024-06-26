import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("미세먼지 수치를 입력하세요.");
        int amount = sc.nextInt();

        if (amount <= 15) {
            System.out.println("좋음");
        } else if (amount > 15 && amount <= 35) {
            System.out.println("보통");
        } else if (amount > 36 && amount <= 75) {
            System.out.println("나쁨");
        }else {
            System.out.println("매우나쁨");
        }

    }
}
