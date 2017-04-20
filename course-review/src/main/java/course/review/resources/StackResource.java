package course.review.resources;

import course.review.model.Response;
import course.review.services.StackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StackResource {

    @Autowired
    StackService stackService;

    @RequestMapping("/push")
    public Response push(){
        String test = stackService.push(, 1);


    }
}
