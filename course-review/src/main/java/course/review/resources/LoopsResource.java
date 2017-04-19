package course.review.resources;

import course.review.services.LoopsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//This class makes it so that when you go to localhost:8080/.... you will get the response of whatever loop you want
@RestController
public class LoopsResource {

    //Making LoopsService class available to all methods.
    @Autowired
    LoopsService loopsService;

    @RequestMapping("/for-loop")
    public int[] forLoop(){
        return loopsService.forLoop();
    }

    @RequestMapping("/enhanced-for-loop")
    public int[] enhancedForLoop(){
        return loopsService.enhancedForLoop();
    }

    @RequestMapping("/while-loop")
    public int[] whileLoop(){
        return loopsService.whileLoop();
    }

    @RequestMapping("/do-while-loop")
    public int[] doWhileLoop(){
        return loopsService.doWhileLoop();
    }
}