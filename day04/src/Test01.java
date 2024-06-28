//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Test01 {
    public static void main(String[] args) {

        // 알고리즘
        // 배열에서 중복찾아내기 - for문으로
        // 랜덤 숫자 발생시키기

 /*       int [] num = {1,2,3,4,5};

        for(int i = num.length-1; i >= 0; i--){
            System.out.println(num[i]);
        }

        for(int i = 0; i < num.length ; i++){
            System.out.println(num[i]);
        }


        System.out.println("-------------");
*/


        int [] com = new int[5];

        for( int i = 0; i < com.length; i++){
            com[i] = (int) (Math.random() * 9);
            for(int j = i-1; j >= 0; j--){
                if(com[i] == com[j]){
                    i--;
                    break;
                }
            }
        }

        // 향상된 for문
        // for( 자료형 변수명 : 배열명){}
        for( int num : com ){
            System.out.println(num);
        }








    }
}