package score;

public class Test {

    public static void main(String[] args) {

        Student stLee = new Student(100, "이순신", 3);

        Subject kor = new Subject(1000, "국어", 85);
        stLee.setKorea( kor );

        System.out.println(stLee);
        System.out.println(stLee.getKorea());
        System.out.println(stLee.getKorea().getSubjectName());
        System.out.println(stLee.getKorea().getScore());
    }
}