package course.review.resources;

import course.review.services.MainClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainClassResource {

    @Autowired
    MainClassService mainClassService;

    @RequestMapping("/static-override-overload")
    public void mainClass(){
        mainClassService.setting();
    }
}