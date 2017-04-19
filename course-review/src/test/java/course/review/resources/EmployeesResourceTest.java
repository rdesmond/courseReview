package course.review.resources;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeesResourceTest {

    EmployeesResource employeesResource = new EmployeesResource();

    @Test
    public void getAllEmployees() throws Exception {
        assertNotNull(employeesResource.getAllEmployees());
    }
}