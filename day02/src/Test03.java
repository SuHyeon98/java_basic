import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        /*


         */

        Scanner sc = new Scanner(System.in);

        System.out.println("학생 이름을 입력하세요 : ");
        String name = sc.next();

        System.out.println("학생 이름을 입력하세요 : ");
        String name1 = sc.next();

        System.out.println("수학 점수를 입력하세요 : ");
        int score = sc.nextInt();

        System.out.println("수학 점수를 입력하세요 : ");
        int score1 = sc.nextInt();

        int sum = score + score1;
        // 정수의 나눗셈은 소수점 자체가 버려짐
        // 때문에 둘 중 하나는 형변환을 해야 함
        double avg = (double)sum / 2;

        System.out.println(name + " : " + score + "점");
        System.out.println(name1 + " : " + score1 + "점");
        System.out.println("--------------------");
        System.out.println("총점 : " + sum + "점");
        System.out.println("평균 : " + avg + "점");
    }
}
