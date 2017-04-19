package course.review.resources;

import course.review.model.Response;
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
    public Response forLoop(){
        int[] test = loopsService.forLoop();

        if(test.length == 0){
            return new Response(null, "400", "Error retrieving for loop");
        }
        else{
            return new Response(test, "200");
        }
    }

    @RequestMapping("/enhanced-for-loop")
    public Response enhancedForLoop(){
        int[] test = loopsService.enhancedForLoop();

        if(test.length == 0){
            return new Response(null, "400", "Error retrieving enhanced for loop");
        }
        else{
            return new Response(test, "200");
        }
    }

    @RequestMapping("/while-loop")
    public Response whileLoop(){
        int[] test = loopsService.whileLoop();

        if(test.length == 0){
            return new Response(null, "400", "Error retrieving for while loop");
        }
        else{
            return new Response(test, "200");
        }
    }

    @RequestMapping("/do-while-loop")
    public Response doWhileLoop(){
        int[] test = loopsService.doWhileLoop();

        if(test.length == 0){
            return new Response(null, "400", "Error retrieving do while loop");
        }
        else{
            return new Response(test, "200");
        }
    }
}