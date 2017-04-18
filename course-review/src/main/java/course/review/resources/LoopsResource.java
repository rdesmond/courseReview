package course.review.resources;

import course.review.services.LoopsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoopsResource {

    @Autowired
    LoopsService loopsService;

    @RequestMapping("/loops")
    public void loops(){
        loopsService.forLoop();
        loopsService.enhancedForLoop();
        loopsService.whileLoop();
        loopsService.doWhileLoop();
    }
}