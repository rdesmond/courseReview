package course.review.other;

//Super class that exists just to show inheritance. Just a POJO.
public class Vehicle {
    private String color;
    private int speed;
    private int size;

    public String attributes() {
        return "Test";
    }

    //Polymorphism example - is an overloaded method
    public String attributes(int x){
        return "Test";
    }
    //Getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}