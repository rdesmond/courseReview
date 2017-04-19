package course.review.services;

import course.review.other.Car;
import org.springframework.stereotype.Service;

//Subclass of Car which is a subclass of Vehicle to show off Inheritance.
//Also includes a switch statement.
@Service
public class SportsCarService extends Car {

    //Shows that I can use the variables and methods from the super class because of Inheritance.
    public Object car() {
        super.setColor("Blue");
        super.setSpeed(200);
        super.setSize(22);
        super.setCC(1000);
        super.setGears(5);
        return(super.carAttributes());
    }

    //Simple switch statement which doesn't need breaks because it uses return statements instead.
    public boolean switchExample(){
        String car = "Lamborghini";
        switch(car) {
            case "Lamborghini":
                return true;
            case "Bugatti" :
                return true;
            case "Ferrari" :
                return true;
            default :
                return false;
        }
    }
}
