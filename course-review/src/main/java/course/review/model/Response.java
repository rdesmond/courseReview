package course.review.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * This is a basic API Response object
 * Example usage:
 *
 * @RequestMapping("/students")
public Response getAllStudents() {

ArrayList<Student> students = new ArrayList();

students = studentService.getAllStudents();

if (students.size() == 0){
return new Response(null, "400", "Error retrieving students");
} else {
return new Response(students, "200");
}
}
 *
 */

public class Response<T extends Object> {

    // variable for response status -
    // 200 is ideal response that all is well
    String status;

    // variable to hold response msg
    @JsonInclude(Include.NON_NULL)
    String message;

    // variable for error msg in case of error
    @JsonInclude(Include.NON_NULL)
    String error;

    // Generic variable that extends Object - place the object
    Object response;

    /**
     *
     * @param ob
     * @param status
     * @param error
     */
    public Response(T ob, String status, String error, String message) {
        this.response = ob;
        this.status = status;
        this.error = error;
        this.message = message;
    }

    public Response(T ob, String status, String message) {
        this.response = ob;
        this.status = status;
        this.message = message;
    }

    public Response(T ob, String status) {
        this.response = ob;
        this.status = status;
    }

    // default constructor
    public Response() {

    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", error='" + error + '\'' +
                ", response=" + response +
                '}';
    }
}