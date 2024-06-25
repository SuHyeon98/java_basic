import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        // if 문 조건을 다양하게

        Scanner sc = new Scanner(System.in);


//        System.out.println("나이를 입력하세요 : ");
//        int age = sc.nextInt();
//
//        System.out.println("키를 입력하세요 : ");
//        double height = sc.nextDouble();
//
//        if (age >= 6 && height >= 120) /* and */ {
//            System.out.println("놀이공원 입장 가능");
//        } else {
//            System.out.println("놀이공원 입장 불가능");
//        }
//
//        if (age >= 6 || height >= 120) /* or */ {
//            System.out.println("놀이공원 입장 가능");
//        } else {
//            System.out.println("놀이공원 입장 불가능");
//        }

        System.out.println("a 점수를 입력하세요 : ");
        int a = sc.nextInt();

        System.out.println("b 점수를 입력하세요 : ");
        int b = sc.nextInt();

        System.out.println("c 점수를 입력하세요 : ");
        int c = sc.nextInt();

        int total = a + b + c;
        double avg = (double) total / 3;

        if ((a >= 60 && b >= 60 && c >= 60) || avg >= 70) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
        System.out.println("총점 : " + total + "/ 평균 : " + avg);
    }
}
