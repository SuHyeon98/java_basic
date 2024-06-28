package array;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {
        int[] arr01 = {1,2,3}; // 참조 변수
        int[] arr02 = arr01; // 얕은 복사 : 주소값만 복사
        int[] arr03 = new int[arr01.length]; // 깊은 복사 1-1
        int[] arr04 = Arrays.copyOf(arr01, arr01.length); // 깊은 복사 1-2
        int[] arr05 = arr01.clone(); // 깊은 복사(?)

        // 깊은 복사
        // 새로운 배열을 생성해서 복사 : 1-1
        for (int i = 0; i < arr01.length; i++) {
            arr03[i] = arr01[i]; // 값에 직접 접근
        }



        System.out.println("arr01 배열 :" + Arrays.toString(arr01));

        arr02[1] = 10;

        System.out.println("------------------------------");

        System.out.println("arr01 배열 :" + Arrays.toString(arr01));
        System.out.println("arr02 배열 :" + Arrays.toString(arr02));
        System.out.println("arr03 배열 :" + Arrays.toString(arr03));
        System.out.println("arr04 배열 :" + Arrays.toString(arr04));
        System.out.println("arr05 배열 :" + Arrays.toString(arr05));
    }
}
