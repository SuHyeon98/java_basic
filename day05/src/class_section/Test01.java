package class_section;

public class Test01 {

    public static void main(String[] args) {

        // Class name = 자료형 이름

        Person p = new Person();

        //메모리 공간 : 코드, 데이터, 스택, 힙
        // new class() : 힙 영역 생성
        // 참조변수(객체명) --> 스택 영역에 생성

        p.setName("홍길동");
        p.setAge(20);
        p.setHeight(170);
        p.setGender(true);

        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getHeight());
        System.out.println(p.isGender());

        System.out.println("----------------------");

        Student stLee = new Student();

        stLee.setStudentName("이순신");
        stLee.setStudentId(10001);
        stLee.setGrade(3);

        System.out.println(stLee.getStudentName());
        System.out.println(stLee.getStudentId());
        System.out.println(stLee.getGrade());

    }
}
