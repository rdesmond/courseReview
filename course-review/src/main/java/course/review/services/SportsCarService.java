package course.review.services;

import course.review.other.Car;
import org.springframework.stereotype.Service;

@Service
public class SportsCarService extends Car {

    public void car() {
        super.setColor("Blue");
        super.setSpeed(200);
        super.setSize(22);
        super.setCC(1000);
        super.setGears(5);
        super.carAttributes();
    }

    public void switchExample(){
        String car = "Lamborghini";
        switch(car) {
            case "Lamborghini":
                System.out.println("Excellent!");
                break;
            case "Bugatti" :
                System.out.println("Woot woot!");
                break;
            case "Ferrari" :
                System.out.println("Ow ow!");
                break;
            default :
                System.out.println("No car for you. :(");
        }
        System.out.println("Your car is " + car);
    }
}
