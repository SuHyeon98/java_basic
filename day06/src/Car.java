// 객체 설계
// 힙 영역에 메모리 할당
// 좋은 클래스 설계 6가지 조건
// VO : Value Object (값을 담아 놓는 용도의 클래스)
// DTO : Date Transfer Object(값을 담아 전송하는 용도의 클래스)
    /*
        1) private 으로 정보 은닉
            - 정보은닉 : 다른 객체에게 자신의 정보를 숨기고 자신의 동작, 기능, 연산만을 통해 접근 허용
            - 클래스 외부에서 특정 정보에 접근을 막는다는 의미
        2) getter - 읽기
        3) setter - 쓰기
        4) 기본 생성자 생성
        5)  생성자 오버로딩해 객체 초기화
        6) toString 재정의 재정의
     */
public class Car {

    // 제조회사, 연식, 차종, 컬러
    private String company;
    private int  year;
    private String carType ;
    private String color;

    // 생성자(constructor) - 초기화
    // 오버로딩 : 메서드 이름이 같은, 매개변수(parameter - params) 자료형 갯수가 다름
    public Car(){} // 기본 생성자 = default
    public Car(String company, int year, String carType, String color) {
        this.company = company;
        this.year = year;
        this.carType = carType;
        this.color = color;

    } // 기본 생성자 - 생성자가 아예 없을 때, 안 써줘도 자동으로 생성


    // getter
    public String getCompany() {
        return company;
    }

    public int getYear() {
        return year;
    }

    public String getCarType() {
        return carType;
    }

    public String getColor() {
        return color;
    }


    //setter
    public void setCompany(String company) {
        this.company = company;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setColor(String color) {
        this.color = color;
    }


    void powerOn() {
        System.out.println("시동을 켠다");
    }

    void powerOff() {
        System.out.println("시동을 끈다");
    }

    void wiperOn() {
        System.out.println("와이퍼를 킨다");
    }

    void wiperOff() {
        System.out.println("와이퍼를 끈다");
    }

    // 객체의 정보를 출력해주는 메서드를 만듦
    // 모든 객체는 정의하지 않아도 기본으로 가지고 있는 메서드가 있음
    // toString() 기본 기능 : 클래스의 정보를 출력 => 클래스명&주소값
    // 클래스명과 주소값 정보가 필요한 경우가 거의 없어서
    // toString() 메서도의 기능을 보유하고 있는 멤버변수의 내용을 출력하는 용도로 변경해 사용

    @Override
    public String toString() {
        return company + "/" + carType + "/" + color + "/" + year + "/";
    }

}
