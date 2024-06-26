import java.sql.SQLOutput;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 문제 1

        int[] score = new int[3];
        int sum = 0;
        double avg;

        for (int i = 0; i < score.length; i++) {
            System.out.println("점수를 입력하시오");
            score[i] = sc.nextInt();
        }

        for (int i = 0; i < score.length; i++)
            sum += score[i];


        avg = (double) sum / score.length;
        System.out.println("합계 : " + sum + " / 평균 : " + avg);

        System.out.println("-----------------------------");

        //문제 2

        System.out.println("임의의 정수 입력");
        int num = sc.nextInt();

        sum = 0;

        for (int i = 1; i < num; i+=2) {
            sum += i;
        }
        System.out.println("홀수 합 : " + sum);

        System.out.println("-----------------------------");

        // 문제 3

        int[] scores = {78, 85, 95, 65, 90};
        int max = scores[0];
        int min = scores[0];

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) max = scores[i];
            if (scores[i] < min) min = scores[i];
        }
        System.out.println("최대값 : " + max + " / 최소값 : " + min);
        System.out.println("-----------------------------");

        // 문제 4

        System.out.println("단 수 입력 : ");
        int dan = sc.nextInt();

        for(int i=1; i < 10; i++) {
//            if (dan < i) break;
              System.out.println(dan + " x " + i + " = " + dan * i);
            }
        System.out.println("-----------------------------");
    }
}
