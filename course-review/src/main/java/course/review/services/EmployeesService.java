package course.review.services;

import course.review.mappers.EmployeesMapper;
import course.review.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
//Services are the "brains". You want to put "logic" here.
@Service
public class EmployeesService {
    @Autowired
    EmployeesMapper employeesMapper;

    public ArrayList<Employees> getAllEmployees(){
        return employeesMapper.getAllEmployees();
    }
}