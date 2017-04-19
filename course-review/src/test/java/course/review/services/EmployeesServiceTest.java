package course.review.services;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeesServiceTest {

    EmployeesService employeesService = new EmployeesService();

    @Test
    public void getAllEmployees() throws Exception {
        assertNotNull(employeesService.getAllEmployees());
    }
}