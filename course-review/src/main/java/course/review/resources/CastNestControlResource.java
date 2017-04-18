package course.review.resources;

import course.review.services.CastNestControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CastNestControlResource {

    @Autowired
    CastNestControlService castNestControlService;

    @RequestMapping("/cast-nest-control")
    public void castNestControl(){
        castNestControlService.Casting();
        castNestControlService.Nesting();
        castNestControlService.Control();
    }
}