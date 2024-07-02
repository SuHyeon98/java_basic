package score;

public class Student {

    private int studentId;
    private String studentName;
    private int grade;

    private Subject korea;
    private Subject math;

    public Student(){}
    public Student(int studentId, String studentName, int grade){
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public Subject getKorea() {
        return korea;
    }

    public Subject getMath() {
        return math;
    }

    public void setKorea(Subject korea) {
        this.korea = korea;
    }

    public void setMath(Subject math) {
        this.math = math;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getGrade() {
        return grade;
    }

    @Override // 애노테이션 , 주석, - 메서드오버라이드(재정의)를 할때 붙여줘야 한다.
    public String toString(){
        return studentId +"/" + studentName + "/" + grade;
    }

}
