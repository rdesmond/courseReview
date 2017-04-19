package course.review.other;

//Super class that exists just to show inheritance. Just a POJO.
public class Car extends Vehicle {
    private int CC;
    private int gears;


    public void carAttributes() {
    }

    //Exists to show method overriding.
    @Override
    public String attributes() {
        return "Overriding Test";
    }

    //Getters and setters
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