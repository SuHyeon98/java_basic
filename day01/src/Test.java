import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Test {

    public static void main(String[] arg) {

        /*// 키보드로부터 데이터를 입력 받을 수 있는 객체 선언
        Scanner scan = new Scanner(System.in); // 참조 자료형

        System.out.println("이름 입력 : ");
        String name = scan.next(); // 문자열 받을 때

        System.out.println("나이 입력 : ");
        int age = scan.nextInt(); // 정수형 받을 때

        System.out.println("키 입력 : ");
        double height = scan.nextDouble(); // 정수형 받을 때

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height)*/;

        // 원의 지름과 높이를 입력 받아서, 원통의 부피를 구하는 프로그램을 작성
        Scanner scan = new Scanner(System.in);

        System.out.println("원의 지름 입력 : ");
        double diameter = scan.nextDouble();

        System.out.println("원의 높이 입력  : ");
        double height = scan.nextDouble();

        System.out.println("원의 부피 값은 : " + (4/3)*Math.PI*Math.pow((diameter/2),3));


    }
}
