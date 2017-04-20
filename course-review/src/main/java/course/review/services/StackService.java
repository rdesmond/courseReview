package course.review.services;

import org.springframework.stereotype.Service;
import java.util.EmptyStackException;
import java.util.Stack;

@Service
public class StackService {
    public static String push(Stack st, int a) {
        st.push(new Integer(a));
        return "push(" + a + ")    stack: " + st;
    }

    public static String pop(Stack st) {
        Integer a = (Integer) st.pop();
        return "pop -> " + a + "stack: " + st;
    }

    public static String createStack() {
        Stack st = new Stack();

        push(st, 10);
        push(st, 20);
        push(st, 30);
        pop(st);
        pop(st);
        pop(st);

        try {
            pop(st);
        }catch (EmptyStackException e) {
            return "Empty stack";
        }
        return "stack: " + st;
    }
}