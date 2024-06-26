import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("국적을 입력하세요(내국인 or 외국인) : ");
        String type = sc.next();

        System.out.println("나이 : ");
        int age = sc.nextInt();


        if (type.equals("내국인")) {

            System.out.println("종로구민? y or n");
            String jongro = sc.next();

            if (jongro.equals("y") || jongro.equals("Y")) {
                System.out.println("50% 할인 : 1500원입니다.");
            } else {
                if (age <= 24) {
                    System.out.println("입장료는 무료입니다.");
                }else {
                    System.out.println("입장료 3000원입니다.");
                }
            }
        } else {
            if (age <= 19) {
                System.out.println("입장료는 무료입니다.");
            }else {
                System.out.println("입장료 3000원입니다.");
            }
        }
    }
}
