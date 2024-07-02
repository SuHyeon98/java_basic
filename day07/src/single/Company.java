package single;

// single ton pattern
// hip 영역 메모리가 1개만 생성될 수 있도록 설계
public class Company {

    // 나의 객체를 담을 수 있는 static 변수 선언
    private static Company instance = null;

    // 생성자 - private - 외부에서 생성x
    private Company() {
        System.out.println("회사 설립");
    }

    // static을 사용하는 method는 자동으로 static이 되서 붙여야 함
    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
