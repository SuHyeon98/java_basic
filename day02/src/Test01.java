//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Test01 {
    public static void main(String[] args) {
        /*
            컴퓨터가 어떤 데이터 처리, 메모리 공간에 숫자를 저장하고 처리를 해야 됨
            메모리 = 책상(작업공간)

            데이터 종류 = data type = 자료형 = type
            1) 기본 자료형
            - 정수 : int - 4byte 크기의 정수를 저장할 수 있는 메모리 공간을 할당
            - 실수 : double - 8byte 크기의 실수를 저장할 수 있는 메모리 공간 할당
            - 문자 : char - 2byte 문자 1개 저장 가능 /

            2) 참조 자료형
            - 값 가지고 있지 x , 해당 값이 있는 주소값을 가지고 있음
            - 해당 주소값으로 찾아가서 값을 불러옴

            데이터를 담을 수 있는 메모리 공간 2가지 종류

            1) 변수 : 값 변경 0

            형식 : 자료형(type) 변수명(name) = 초기값(value);

            객체지향 프로그래밍
            class 선언 --> 클래스(class) 참조변수명(name) = new 클래스명();


            2) 상수 : 값 변경 x
            (1) 리터럴  상수 : 초기화를 위해 써준 값들
            (2) 심볼릭 상수 : 내가 만들어준 상수
                - final 자료형(type) 변수명(name) = 초기값(value);
                - 값이 고정, 변경하려고 하면 오류
                - 이름 : 일반적으로 대문자로 표현하고, _로 연결

            변수명 제한 규칙
            - 영어 대소문자 구분, 숫자로 시작x , 공백x , 특수기호 $ _ 사용 가능

            변수명 짓는 방법
            (1) kamel : userName
                - java : 변수명 --- userName / html, css
            (2) pascal : UserName
                - java : 클래스명 --- HighSchool
            (3) snake : user_name
                - java : 상수명 - 전체 대문자로 해서 snake style 로 지음
                         - MAX_BATTERY
            (4) kebab : user-name
                - html, css


            자료 형변환
            일반자료형 : 자료형의 손실이 일어나지 않는 방향으로
            1) 자동형변환(= 묵시적 형변환)
                - 정수 -> 실수
                - 작은 크기 자료형 -> 큰 크기 자료형

            2) 강제형변환(= 명시적 형변환)
                - 실수 -> 정수
                - 큰 크기 자료형 -> 작은 크기 자료형

                캐스트 연산자 : (자료형) 값 / 변수

                int num = 10;
                int result = (int) (num * 0.3)


            자료 입력하기
            Scanner sc = new Scanner(System.in);

            정수 입력받기
            System.out.println("나이 입력: ");
            sc.nextInt();

            실수 입력받기
            System.out.println("몸무게 입력 : ");
            double weight = sc.nextDouble();

            문자 입력받기
            System.out.println("이름 입력 : ");
            String name = sc.next();

            System.out.println(name + "/" + age + "/" + weight);
         */

        int num = 10;
        double result = num * 0.3;
        System.out.println(result);

    }
}