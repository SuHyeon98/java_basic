import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
//        String str1 = "Hello"; //리터럴 상수의 주소값을 가지고 있음
//        String str2 = "Hello";
//        String str3 = new String("Hello"); // 힙영역에 메모리가 할당
//        String str4 = new String("Hello");
//
//        // 리터럴 상수는 같은 것을 똑같은 위치를 가리키게 되어 있음
//        // 해당 자료형의 주소값을 비교
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//        System.out.println(str4 == str3);
//
//        System.out.println(str1.equals(str3));

        String ID = "love";
        String pw = "1234";

        Scanner sc = new Scanner(System.in);


        System.out.println("아이디를 입력하세요 : ");
        String id1 = sc.next();

        System.out.println("비밀번호를 입력하세요 : ");
        String pw1 = sc.next();

        if (id1.equals(ID) && pw1.equals(pw)) {
            System.out.println("로그인 성공!");
        } else if (!id1.equals(ID)) {
            System.out.println("아이디가 틀렸습니다");
        } else if (!pw1.equals(pw)) {
            System.out.println("비밀번호가 틀렸습니다");
        } else {
            System.out.println("정보가 맞지 않습니다");
        }
    }
}
