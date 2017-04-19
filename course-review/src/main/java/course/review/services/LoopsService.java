package course.review.services;

import org.springframework.stereotype.Service;
import java.util.ArrayList;

//This class demonstrates all of the loops.

@Service
public class LoopsService {

    //This method demonstrates the for loop.
    public int[] forLoop(){
        int[] test = new int[10];

        for (int i = 0; i < 10; i++){
            test[i] = i;
        }

        return test;
    }

    //This method demonstrates the enhanced for loop.
    public int[] enhancedForLoop() {
        int[] test = new int[8];

        int[] values = {0, 1, 2, 3, 4, 5};

        for (int i : values) {
            test[i] = i;
        }
        return test;
    }

    //This method demonstrates the while loop.
    public int[] whileLoop(){
        int[] test = new int[10];

        int x = 0;

        while( x < 10 ) {
            test[x] = x;
            x++;
        }

        return test;
    }

    //This method demonstrates the do while loop.
    public int[] doWhileLoop(){
        int[] test = new int[10];

        int x = 0;

        do {
            test[x] = x;
            x++;
        }while( x < 10 );

        return test;
    }
}