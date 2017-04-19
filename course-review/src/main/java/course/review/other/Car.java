package course.review.other;

//Super class that exists just to show inheritance. Just a POJO.
public class Car extends Vehicle {
    private int CC;
    private int gears;


    public Object carAttributes() {
        this.getCC();
        this.getGears();
        super.getColor();
        super.getSize();
        super.getSpeed();
        super.getClass();
        return attributes();
    }

    //Exists to show method overriding.
    @Override
    public String attributes() {
        return "Test";
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