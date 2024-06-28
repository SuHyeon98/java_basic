import java.util.Scanner;

public class Test04 {

    public static void main(String[] args) {

        // for - 횟수가 정해진 경우
        // 반복문 - 무한 반복

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("숫자 입력 :");

            int num = sc.nextInt();
            if(num == 0) {
                System.out.println("종료");
                break;
            }
            System.out.println(num);
        }

    }
}
