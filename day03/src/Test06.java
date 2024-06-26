import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println((int)(Math.random() * 101)+1);

        int[] com = new int[3];

        for (int i = 0; i < com.length; i++) {
            com[i] += (int)(Math.random() * 10) + 1;
            System.out.println("com"+ "["+ i + "]" + ": " + com[i]);
        }

        System.out.println("-----------------------------");

        for (int i = 0; i < com.length; i++) {
            com[i] += (int)(Math.random() * 9) + 1;

            for (int j = i-1; j > 0; j--) {
                if (com[i] == com[j]) {
                    i--; break;
                }
            }
            System.out.println("com"+ "["+ i + "]" + ": " + com[i]);
        }



    }
}
