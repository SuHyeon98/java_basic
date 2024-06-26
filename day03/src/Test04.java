import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수형
        int[] num = new int[3];

        System.out.println("점수1 : ");
        num[0] = sc.nextInt();
        System.out.println("점수2 : ");
        num[1] = sc.nextInt();
        System.out.println("점수3 : ");
        num[2] = sc.nextInt();

        System.out.println("점수1 : " + num[0]);
        System.out.println("점수2 : " + num[1]);
        System.out.println("점수3 : " + num[2]);


        // 정수형&실수형 - 일반 자료형
        int[] arr = new int[3];
        double[] dArr = new double[3];

        // 문자열 - 참조 자료형
        String[] str = new String[3];

        // 반복문
        for (int i = 0; i < 3; i++) {
            System.out.println("문자열" + (i+1) + " : ");
            str[i] = sc.next();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(str[i]);
        }

        for (int i = 1; i <= 10; i+=2) {
            System.out.println(i);
        }

        System.out.println("------------------------");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1)
                System.out.println(i);
        }

    }
}
