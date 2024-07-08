package tour;

public class KoreaTour implements Tour {

    @Override
    public void program() {
        System.out.println("경복궁 -> 인사동 -> 한강");
    }

    @Override
    public void meal() {
        System.out.println("아침 : 비빔밥 / 점심 : 불고기 / 저녁 : 치킨");
    }

    @Override
    public void hotel() {
        System.out.println("신라호텔");
    }
}
