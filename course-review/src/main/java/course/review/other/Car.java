package course.review.other;

public class Car extends Vehicle {
    private int CC;
    private int gears;

    public void carAttributes() {
        System.out.println("Color of Car : " + getColor());
        System.out.println("Speed of Car : " + getSpeed());
        System.out.println("Size of Car : " + getSize());
        System.out.println("CC of Car : " + CC);
        System.out.println("No of gears of Car : " + gears);
    }

    @Override
    public void attributes() {
        System.out.println("Color : " + getColor());
        System.out.println("Speed : " + getSpeed());
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }
}