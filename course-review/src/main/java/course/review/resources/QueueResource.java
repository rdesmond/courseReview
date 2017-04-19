package course.review.resources;

import course.review.model.Response;
import course.review.services.QueueService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueueResource {

    QueueService queueService = new QueueService(10);

    //I want to do @post for this... but idk how...
    @RequestMapping("/put-queue")
    public Response putQueue(){
        String test = queueService.putQueue(1);

        if(test == null){
            return new Response(null, "400", "Error putting value in queue");
        }
        else{
            return new Response(test, "200", "Success!");
        }
    }

    @RequestMapping("/get-queue")
    public Response getQueue(){
        String test = queueService.getQueue();

        if(test == null){
            return new Response(null, "400", "Error getting queue");
        }
        else{
            return new Response(test, "200", "Success!");
        }
    }
}