package class_section;

// class 정의 = 새로운 자료형
// 담고자 하는 정보를 변수로 선언해 줌
public class Person {

    // 멤버변수 = 필드(field)
    private String name;
    private int age;
    private double height;
    private boolean gender;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public boolean isGender() {
        return gender;
    }
}
