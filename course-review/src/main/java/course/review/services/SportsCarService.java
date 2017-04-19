package course.review.services;

import course.review.other.SportsCar;
import org.springframework.stereotype.Service;

//Creates instance of SportsCar
//Includes sample switch statement
@Service
public class SportsCarService {
    SportsCar sportsCar;

    SportsCarService(){
        sportsCar = new SportsCar();
        sportsCar.setCar();
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

    public SportsCar getSportsCar() {
        return sportsCar;
    }
}