package course.review.resources;

import course.review.model.Response;
import course.review.services.QueueService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//This class makes it so that when you go to localhost:8080/.... you will get the response of whatever loop you want
@RestController
public class QueueResource {

    //Creating queue with a size of 10
    QueueService queueService = new QueueService(10);

    @RequestMapping("/put-queue")
    public Response putQueue(){
        //Putting 1 in the queue
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