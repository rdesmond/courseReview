package course.review.resources;

import course.review.services.SportsCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SportsCarResource {

    @Autowired
    SportsCarService sportsCarService;

    @RequestMapping("/sportscar")
    public void sportsCar(){
        sportsCarService.car();
        sportsCarService.switchExample();
    }
}