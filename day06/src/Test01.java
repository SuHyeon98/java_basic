import score.OrderInfo;
import score.Student;

public class Test01 {
    public static void main(String[] args) {

        /*
            className attribute = new className();

            객체 :
            1) 상태(정보) - 변수에 저장
                - 자동차 제조회사
                - 색상
                - 연식
                - 차종
                - 바퀴
                ...

            2) 행동(동작) - 메서드로 정의
                - 시동
                - 각 기능들의 동작 여부

         */

        /*Car myCar = new Car("HD", 2024, "중형", "red");
        Car urCar = new Car("KIA", 2024, "소형", "black");
        // argument(arg) : 실제로 함수가 호출될 때 넘기는 변수값

        myCar.powerOn();
        myCar.wiperOn();
        myCar.wiperOff();
        myCar.powerOff();

        System.out.println(myCar.getCompany());
        System.out.println(myCar.getYear());
        System.out.println(myCar.getCarType());
        System.out.println(myCar.getColor());

        System.out.println(myCar);*/ // 객체명만 써도 toString() 메서드가 자동 실행
        // System.out.println(mycar.toString());


        Student stLee = new Student("이순신", 30, 3);
        Student stKim = new Student("김유신", 28, 2);

        System.out.println(stLee);
        System.out.println(stKim);

        OrderInfo or = new OrderInfo(1, 0701, 1, "햄버거", 8000);

    }
}
