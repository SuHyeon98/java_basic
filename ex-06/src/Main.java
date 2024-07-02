import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // 객체생성 ( 설계한대로 생산)
        // 메모리공간에 할당되어 해당메모리에 값을 저장하거나,
        // 코드를 호출하여 실행할 수 있는 상태가 된것
        // 자료형 변수명;
        // 클래스명 객체명 = new 클래스명();   ---- 객체명 = 참조변수명
        // 객체명 : 힙영역에 생성된 객체의 주소값을 저장한다.
        Car myCar = new Car("Hd", 2024, "중형", "레드");
        Car urCar = new Car("KIA", 2024, "소형", "블랙");

        Car hisCar = new Car();

        // Parameter : 함수를 정의할 때 사용되는 변수 = 매개변수 = params
        // Argument : 실제로 함수가 호출될때, 넘기는 변수값 = 인자, 인수 = args

        // 값 저장만 함
        urCar.setCompany("kia");

        // 객체명 자체를 출력하면 , 객체의 클래스와 주소값이 나타난다.
        System.out.println(myCar); // 객체명만 써도 toString() 메서드의 실행결과 나옴
        System.out.println(myCar.toString());
        System.out.println(urCar);

/*
    객체 = 자동차
    1) 상태(정보) - 변수에 저장
    - 자동차 제조회사
    - 색상
    - 년식
    - 차종
    - 바퀴
    - 와이퍼유무
    - 온열시트유무
    - 에어컨 유무

    2) 행동/동작 - 메서드로 정의
    - 시동켠다/끈다
    - 와이퍼 동작/끈다
    - 전조등 켠다/끈다
    - 속도를 올린다 / 내린다
    - 중지(브레이크)

*/


    }
}