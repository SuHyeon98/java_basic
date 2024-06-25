import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("몸무게를 입력하세요 : ");
        double kg = sc.nextDouble();

        System.out.println("키를 입력하세요 : ");
        double height = sc.nextDouble();

        double BMI = kg / (height * height);
        System.out.println("당신의 BMI 지수는 " + BMI + "입니다.50");

        String result = "";

        if (BMI < 18.5) {
            result += "저체중";
        } else if (18.5 <= BMI && BMI < 25) {
            result += "정상";
        } else if (25 <= BMI && BMI < 30) {
            result += "과체중";
        } else if (BMI > 30) {
            result+= "비만";
        }

        System.out.println("당신은 " + result + "입니다.");
    }
}
