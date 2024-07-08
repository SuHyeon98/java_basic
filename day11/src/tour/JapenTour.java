package tour;

public class JapenTour implements Tour {

    @Override
    public void program() {
        System.out.println("신주쿠 -> 신오쿠보 -> 해리포터스튜디오");
    }

    @Override
    public void meal() {
        System.out.println("아침 : 라멘 / 점심 : 야키니쿠 / 저녁 : 스시");
    }

    @Override
    public void hotel() {
        System.out.println("신주쿠 호텔");
    }
}
