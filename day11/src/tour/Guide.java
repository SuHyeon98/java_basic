package tour;

public class Guide {

    Tour tour;

    public Guide(Tour tour) {
        this.tour = tour;
    }

    void tourSchedule(){
        tour.program();
        tour.meal();
        tour.hotel();
    }


}
