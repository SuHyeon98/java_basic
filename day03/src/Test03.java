public class Test03 {
    public static void main(String[] args) {
        // if~else와 비슷한 삼항연산자
        // (조건) ? 참 : 거짓;
        // 변수 = (조건) ? 참 : 거짓;

        int a = 10;
        if (a > 10) {
            System.out.println("맞다");
        }else {
            System.out.println("아니다");
        }

        System.out.println((a > 10) ? "맞다" : "아니다");
        // 3개 연산이 있어서 삼항연산자
        // (a > 10) 1개
        // ? 앞 연산에 대하여
        // "맞다" 2개 - true
        // "아니다" 3개 - false

        String answer = (a > 10) ? "맞다" : "아니다";
        System.out.println(answer);

        // num 변수에 임의의 숫자를 저장
        // num이 10보다 크면, +1 10보다 작으면 -1

        int num = 5;

        System.out.println((num > 10) ?  --num : ++num );
        System.out.println(num);
    }
}
