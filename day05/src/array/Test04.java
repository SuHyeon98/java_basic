package array;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {

        int[] card = {1,6,4,5,3,2};
        int[] newCard = new int[card.length];

        System.arraycopy(card, 0,newCard, 0, 3);

        System.out.println("card : " + Arrays.toString(card));
        System.out.println("newCard : " + Arrays.toString(newCard));
    }
}
