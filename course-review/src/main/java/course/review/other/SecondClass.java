package course.review.other;

//POJO to feed MainClassResource
public class SecondClass {
    private int a;
    private int b;
    private static double pi;

    public static void staticMethod(){
        System.out.println("This is a static method");
    }

    //Getters and setters
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static double getPi() {
        return pi;
    }

    public static void setPi(double pi) {
        SecondClass.pi = pi;
    }
}