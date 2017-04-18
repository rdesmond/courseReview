package course.review.services;

import course.review.other.SecondClass;
import org.springframework.stereotype.Service;

@Service
public class MainClassService {

    SecondClass one = new SecondClass();
    SecondClass two = new SecondClass();
    SecondClass three = new SecondClass();
    SecondClass staticMethod = new SecondClass();

    public void setting() {
        one.setA(1);
        two.setB(1);
        three.setPi(3.14);

        System.out.println(one.getA());
        System.out.println(two.getB());
        System.out.println(three.getPi());
        staticMethod.staticMethod();
    }
}