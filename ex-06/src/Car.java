
// 클래스 선언 = 객체 설계
// 설계도대로 만들어진 객체는 - 힙 영역에 메모리가 할당된다

// 잘 설계된 VO클래스- 6가지 조건
// VO - Value Object (값을 담아 놓는 용도의 클래스)
// DTO - Data Transfer Object( 값을 담아 전송하는 용도의 클래스)
/*
1) private로 정보를 은닉하기
- 정보은닉이란?
- 다른 객체(클래스)에게 자신의 정보(변수값)를 숨기고 자신의 동작, 기능, 연산만을 통해 접근 허용
- 클래스 외부에서 특정 정보에 접근 막는다는 의미
2) getter(값 읽기 용도)
3) setter(값 쓰기 용도)
4) 기본 생성자를 반드시 만들기
5) 생성자 오버로딩하여 객체 초기화 하기
6) toString 재정의(객체의 값 출력용도)
 */

public class Car {

    // 제조회사, 출시년도, 차종, 컬러
    // 멤버변수 = 필드(field)
    private String company;
    private int year;
    private String carType;
    private String color;

    // 생성자 - 초기화
    // 오버로딩 : 생성자 or 메서드의 이름이 같음, 매개변수의 자료형 또는 갯수가 다름.
    public Car(){} // 기본생성자 = default 생성자
    public Car (String company, int year, String carType, String color){
        this.company = company;
        this.year = year;
        this.carType = carType;
        this.color = color;

    } // 기본생성자 - 생성자가 아예 없을 때, 안 써줘도 자동으로 생김

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

    // setter
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

    void powerOn(){
        System.out.println("운행 시작");
    }

    void powerOff(){
        System.out.println("운행 종료");
    }

    void wiperOn(){
        System.out.println("와이퍼 동작 시작");
    }

    void wiperOff(){
        System.out.println("와이퍼 동작 종료");
    }

    // 객체의 정보를 출력해주는 메서드 만든다.
    // 모든 객체는 정의하지 않아도 기본으로 가지고 있는 메서드가 있음.
    // toString() 기본 기능 : 클래스의 정보를 출력한다 => 클래스명@주소값
    // 클래스명과 주소값 정보가 굳이 필요한 경우가 없어서,
    // toString() 메서드의 기능을 보유하고 있는 멤버변수의 내용을 출력하는 용도로 변경해서 사용

    @Override
    public String toString (){
        return company + "/" + carType + "/" + color + "/" + year;
    }

}
