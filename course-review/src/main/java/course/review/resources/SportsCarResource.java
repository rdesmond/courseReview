package course.review.resources;

import course.review.model.Response;
import course.review.other.SportsCar;
import course.review.services.SportsCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//This class makes it so that when you go to localhost:8080/.... you will get the response of whatever you want
@RestController
public class SportsCarResource {

    @Autowired
    SportsCarService sportsCarService;

    @RequestMapping("/sports-car")
    public Response getSportsCar(){
        SportsCar test = sportsCarService.getSportsCar();

        if(test == null){
            return new Response(null, "400", "Error retrieving sports car");
        }
        else{
            return new Response(test, "200", "Nice car!");
        }
    }

    @RequestMapping("/switch-example")
    public Response switchExample(){
        boolean test = sportsCarService.switchExample();

        if(!test){
            return new Response(null, "400", "Error retrieving switch example");
        }
        else{
            return new Response(test, "200");
        }
    }
}