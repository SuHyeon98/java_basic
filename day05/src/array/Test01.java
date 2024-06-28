package array;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("점수를 입력하세요.");
        int num = sc.nextInt();

        char rank;

        switch (num / 10) {
            case 10, 9:
                System.out.println("A학점입니다.");
                break;
            case 8:
                System.out.println("B학점입니다.");
                break;
            case 7:
                System.out.println("C학점입니다.");
                break;
            case 6:
                System.out.println("D학점입니다.");
                break;
            default:
                System.out.println("F학점입니다.");
                break;
        }

        System.out.println("몇월?");
        int month = sc.nextInt();

        switch (month) {
            case 3, 4, 5 :
                System.out.println("봄");
                break;
            case 6, 7, 8 :
                System.out.println("여름");
                break;
            case 9, 10, 11 :
                System.out.println("가을");
                break;
            case 12, 1, 2 :
                System.out.println("겨울");
                break;
        }
    }
}
