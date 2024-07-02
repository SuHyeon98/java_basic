package Student;

public class School {

    private static School instance = null;

    private School(){}

    public static School getInstance() {
        if (instance == null) {
        instance = new School();
        }
        return instance;
    }

    public static Student resist(String studentName, int grade , int money) {
        return new Student(studentName, grade, money);
    }

}
