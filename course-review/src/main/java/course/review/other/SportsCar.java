package course.review.other;

//Subclass to feed SportsCarService
public class SportsCar extends Car {

    public void setCar() {
        super.setColor("Blue");
        super.setSpeed(200);
        super.setSize(22);
        super.setCC(1000);
        super.setGears(5);
    }

    public void getCar(){
        super.getColor();
        super.getSpeed();
        super.getSize();
        super.getCC();
        super.getGears();
    }
}
