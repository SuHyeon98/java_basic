package array;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        //향상된 switch~case문

        Scanner sc = new Scanner(System.in);

        System.out.println("몇월?");
        int month = sc.nextInt();

        switch (month) {
            case 3, 4, 5 -> System.out.println("봄");
            case 6, 7, 8 -> System.out.println("여름");
            case 9, 10, 11 -> System.out.println("가을");
            case 12, 1, 2 -> System.out.println("겨울");
            default -> System.out.println("오류");
        }

        int year = sc.nextInt();
        int lastDate;
        int LoopYear = 0;

        lastDate = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> LoopYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 29 : 28;
            case 4, 6, 9 -> 30;
            default -> -1;
        };

    }
}
