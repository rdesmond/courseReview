package course.review.mappers;


import course.review.model.Employees;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.ArrayList;

@Mapper
public interface EmployeesMapper {
    String GET_ALL_EMPLOYEES = "SELECT * FROM employees LIMIT 100";

    @Select(GET_ALL_EMPLOYEES)
    public ArrayList<Employees> getAllEmployees();
}