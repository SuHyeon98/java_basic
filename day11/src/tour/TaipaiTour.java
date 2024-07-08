package tour;

public class TaipaiTour implements Tour {

    @Override
    public void program() {
        System.out.println("예루 -> 스팬 -> 진과스 -> 지우펀 폭포");
    }

    @Override
    public void meal() {
        System.out.println("아침 : 딤섬 / 점심 : 우욱탕 / 저녁 : 지파이");
    }

    @Override
    public void hotel() {
        System.out.println("타이페이 호텔");
    }
}
