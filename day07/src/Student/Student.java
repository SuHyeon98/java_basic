package Student;

public class Student {

    public static int serialNum = 3;
    private  int studentId;
    private String studentName;
    private int grade;
    private int money;

    public Student(){}
    public Student(String studentName, int grade, int money) {
        this.studentId = serialNum++;
        this.studentName = studentName;
        this.grade = grade;
        this.money = money;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getGrade() {
        return grade;
    }

    public int getMoney() {
        return money;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override // 애노테이션 , 주석, - 메서드오버라이드(재정의)를 할때 붙여줘야 한다.
    public String toString(){
        return "학번 : " + studentId + "학년 /" + " 이름 : " + studentName +
                " / " + grade + "반 / 잔액 : " + money + "원";
    }

    // 버스 승차 기능
    // 버스 : 1500원
    // 학생 입장에서 money 가 감소
    // 버스 입장에서 price 가 증가

    public void takeBus(Bus bus) {
        bus.take(1500);
        this.money -= 1500;
    }

    public void takeSubway(Subway subway) {
        subway.take(5000);
        this.money -= 5000;
    }

    public void takeTaxi(Taxi taxi) {
        taxi.take(10000);
        this.money -= 10000;
    }

}
