package score;

import java.util.Scanner;

public class OrderInfo {

    Scanner sc = new Scanner(System.in);

    private int orderInfo;
    private int orderDate;
    private int id;
    private String orderMenu;
    private int price;

    public OrderInfo(int orderInfo,int orderDate, int id, String orderMenu, int price) {
        this.orderInfo = orderInfo;
        this.orderDate = orderDate;
        this.id = id;
        this.orderMenu = orderMenu;
        this.price = price;
    }

    void order() {
        System.out.println("무엇을 주문하시겠습니까?");
        this.orderMenu = sc.next();
        System.out.println("--------------------");


    }

    void customer() {
        System.out.println();
    }

}
