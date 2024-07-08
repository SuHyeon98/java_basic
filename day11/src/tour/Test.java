package tour;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Tour tour = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("어느 지역 여행을 가십니까?");
        System.out.println("1) 한국 2) 일본 3) 대만");
        int pick = sc.nextInt();

        switch (pick) {
            case 1 -> new KoreaTour();
            case 2 -> new JapenTour();
            case 3 -> new TaipaiTour();
            default -> System.out.println("오류");
        }

        /*if (pick == 1) {
            tour = new KoreaTour();
        } else if (pick == 2) {
            tour = new JapenTour();
        } else if (pick == 3) {
            tour = new TaipaiTour();
        }else {
            System.out.println("오류");
        }*/

        Guide guide = new Guide(tour);
        guide.tourSchedule();

    }
}
