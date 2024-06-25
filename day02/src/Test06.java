import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("점수를 입력하세요 : ");
        int score = sc.nextInt();
        String grid = "";

        if (score >= 90) {
            grid += "A";
        }else if (score < 90 && score >= 80) {
            grid += "B";
        }else if (score < 80 && score >= 70) {
            grid += "C";
        } else {
            grid += "F";
        }
        System.out.println(grid);
    }
}
