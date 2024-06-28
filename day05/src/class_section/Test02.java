package class_section;

public class Test02 {

    public static void main(String[] args) {

        // 함수(method)
        // 값을 넢으면 해당하는 값을 가공해 다른 형태로 되돌림
        // 접근제한자 반환값(자료형 입력1, 자료형 입력2) {
        //       return 반환값;

        Test02 t = new Test02();

        System.out.println( t.add(2,3));
        System.out.println( t.add(12,32));
        System.out.println( t.add(789567,12344));
        System.out.println("---------------------");
        System.out.println( t.minus(2,3));
        System.out.println( t.minus(12304020,214456455));
        System.out.println( t.minus(123,456));


    }

    // 자주 사용되는 반복되는 코드/동작을 묶어 놓은 것
    int add (int n1, int n2) {
        return n1 + n2;
    }

    double minus (double d1, double d2) {
        return d1 - d2;
    }
}
