import java.util.Scanner;

public class Test03 {

    public static void main(String[] args) {

        // 야구게임 - 0~9사이의 숫자
        // 랜덤 숫자 3개를 발생시키고 - 중복 없어야함
        // 숫자를 맞추는 게임
        // 위치랑 숫자랑 둘다 맞으면 - 1strike
        // 숫자만 맞으면 위치는 틀림 - 1ball
        // 숫자를 입력받아서 0strike, 0ball 출력을 해줌
        // 3strkie라면 정답! 출력 후 종료

        Scanner sc = new Scanner(System.in);

        int[] com = new int[3];
        int[] user = new int[3];
        int strike=0;
        int ball=0;

        for (int i = 0; i < com.length; i++) {
            int num = (int) (Math.random() * 9) + 1;
            for (int j = i; j >= 0; j--) {
                if (num == com[j]) {
                    i--;
                    break;
                }
                com[i] = num;
            }
        }

        for (int num : com) {
            System.out.print(num + "\t");
        }

        System.out.println();


        while(true){
            strike = 0;
            ball = 0;

            // 사용자 입력받음
            for (int i = 0; i < user.length; i++) {
                System.out.print("숫자 입력 : ");
                user[i] = sc.nextInt();
            }
            // 비교로직
            for (int i = 0; i < user.length; i++) {
                // 스트라이크에 해당
                if( com[i] == user[i]){
                    strike++;
                } else{
                    // ball 해당
                    for(int num : user){
                        ball += (com[i] == num) ? 1 : 0;
                    }
                }
            }
            System.out.print("strike : " + strike + "\t");
            System.out.println("ball : " + ball);

            // 종료 조건
            if(strike == 3){
                System.out.println("종료");
                break;
            }
        }
    }
}
