package course.review.resources;

import course.review.model.Employees;
import course.review.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class EmployeesResource {

    @Autowired
    EmployeesService employeesService;

    @RequestMapping("/employees")
    public ArrayList<Employees> getAllEmployees(){
        return employeesService.getAllEmployees();
    }
}