package course.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class CourseReviewApplication{

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(CourseReviewApplication.class);
//	}

	public static void main(String[] args) {
		SpringApplication.run(CourseReviewApplication.class, args);
	}
}
