//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // ; 은 반드시 기재

        int num = 10;
        char ch = 'a'; // 문자 한개만 가능
        String str = "hello";
        String str2 = "b"; // String은 반드시 ""
        String str3 = "c"; // string => String
        double dum = 3.14;
        final double PI = 3.14; // 심볼릭 상수, 고정값 - 값 변경x / final 자료형 변수명 = 초기값;

        num = 20;

        // 문제 1
        int cus1 = 5000;
        int cus2 = 10000;
        int cus3 = 3000;

        final double discount = 0.2;

        double result = cus1 * (1-discount); // 자동 형변환 : up casting
        int result2 = (int)(cus1 * (1-discount)); // 강제 형변환 : down casting

        System.out.println("금액은 = " + (int)(cus1 * (1-discount)) + "원"); // 강제 형변환
        System.out.println("금액은 = " + (int)(cus2 * (1-discount)) + "원");
        System.out.println("금액은 = " + (int)(cus3 * (1-discount)) + "원");
        System.out.println("\t");
        System.out.println(num);
        System.out.println(ch);
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(dum);
        System.out.println(num * num * PI);
    }
}