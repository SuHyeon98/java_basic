package class_section;

public class Student {

    // 접근제한자 - protexted, default
    // public - 외부 클래스에서 자유롭게 접근 가능
    // private - 외부 클래스에서 접근 불가, 내부 클래스 안에서만 접근 가능

    private String studentName;
    private int studentId;
    private int grade;

    // 관문 - 메서드
    // setter - 쓰기 전용

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getGrade() {
        return grade;
    }
}
