public class Test05 {

    public static void main(String[] args) {

        /*int num = 15;

        // souf
        System.out.printf("%5d \n", num);
        System.out.printf("%5.2f\n", 3.141957);

        // 10을 3으로 나누고
        // 10칸을 확보한 상태에서, 소수점 3째자리까지 출력
        System.out.printf("%10.3f\n", (double)10/3);
        System.out.printf("%.3f", (double)10/3);
*/

        char ch = 'A';

        switch (ch) {
            case 'A':
            case 'a':
                System.out.println("첫번째");
                break;
            case 'B':
            case 'b':
                System.out.println("두번째");
                break;
            case 'C':
            case 'c':
                System.out.println("세번째");
                break;
            default:
                System.out.println("오류");
                break;
        }


    char num = 85;

        switch(num /10){
        case 9:
            System.out.println("A등급");
            break;
        case 8:
            System.out.println("B등급");
            break;
        case 7:
            System.out.println("C등급");
            break;
        case 6:
            System.out.println("D등급");
            break;
        default:
            System.out.println("F등급");
            break;
        }
    }
}
