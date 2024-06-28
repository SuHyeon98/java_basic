public class Test02 {

    public static void main(String[] args) {

        // 로또번호 1~45사이의 숫자 6개 발생
        // 변수명은 lotto 라고 하시오.
        // 향상된 for문으로 출력

        int []lotto = new int[6];

        for(int i = 0; i < lotto.length; i++){
            int com = (int)(Math.random() * 45) + 1;
            for(int j = i; j>=0; j--){
                if(com == lotto[j]){
                 i--; break;
                }
                lotto[i] = com;
            }
        }

        for(int num : lotto){
            System.out.println(num);
        }
    }
}
