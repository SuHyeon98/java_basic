public class Test02 {
    public static void main(String[] args) {
        // 연산자
        /*

        1) 사칙연산
        +,-,*,/,%
        % : 나머지 구하는 것

        2) 복합 대입 연산자
        +=, -=, *=, /=, %=

        3) 증감 연산자
        int c = 10;
        (전위 연산자) : 가장 먼저 연산
        ++c; // c = c + 1;
        --c; // c = c -1;
        (후위 연산자) : 가장 마지막에 연산
        c++; // c = c + 1;
        c--; // c = c -1;

        4) 비교 연산자
        >(초과), <(미만), <=(이상), >=(이하), ==(같다), !=(같지 않다)

        비교 연산자의 결과값은 true / false 값으로 됨

         */

        int a = 100;
        int b = 3;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);

        System.out.println("-----------------------------------");

        System.out.println(a * b++);
        b--;
        System.out.println(a * ++b);

        System.out.println("-----------------------------------");

        System.out.println(10 + 3);
        System.out.println(10 - 3);
        System.out.println(10 * 3);
        System.out.println(10 / 3); // 몫만 구함
        System.out.println((double)10 / 3); // 소수점의 결과를 보고 싶다면 캐스팅(형변환)
        System.out.println(10 % 3); // 나머지만 구함
    }
}
