package course.review.other;

//Super class that exists just to show inheritance. Just a POJO.
public class Car extends Vehicle {
    
    // Ryan: the use of capital letters is usually reserved for constant variables
    private int CC; 
    private int gears;


    // Ryan: what is this about below
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
