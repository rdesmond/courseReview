package course.review.resources;

import course.review.model.Response;
import course.review.services.CastNestControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//This class makes it so that when you go to localhost:8080/.... you will get the response of whatever loop you want
@RestController
public class CastNestControlResource {

    //Making CastNestControlService class available to all methods.
    @Autowired
    CastNestControlService castNestControlService;

    @RequestMapping("/casting")
    public Response casting(){
        String test = castNestControlService.casting();

        if(test == null){
            return new Response(null, "400", "Error retrieving sports car");
        }
        else{
            return new Response(test, "200", "Nice car!");
        }
    }

    @RequestMapping("/nesting")
    public Response nesting(){
        String test = castNestControlService.nesting();

        if(test == null){
            return new Response(null, "400", "Error retrieving sports car");
        }
        else{
            return new Response(test, "200", "Nice car!");
        }
    }

    @RequestMapping("/control")
    public Response control(){
        String test = castNestControlService.control();

        if(test == null){
            return new Response(null, "400", "Error retrieving control");
        }
        else{
            return new Response(test, "200", "Success!");
        }
    }
}