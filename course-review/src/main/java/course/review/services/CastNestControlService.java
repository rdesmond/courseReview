package course.review.services;

import org.springframework.stereotype.Service;

//Demonstrates casting, nesting, and control
@Service
public class CastNestControlService {

    public String casting(){
        double d = 100.04;
        long l = (long)d;
        int i = (int)l;
        short s = (short)i;
        byte b = (byte)s;

        return "Double value: " + d +
                "    Long value: " + l +
                "    Int value: " + i +
                "    Short value: " + s +
                "    Byte value: " + b;
    }

    public String nesting(){
        char ch = 'O';

        if (ch == 'A' || ch == 'a')
            return ch + " is a vowel.";
        else if (ch == 'E' || ch == 'e')
            return ch + " is a vowel.";
        else if (ch == 'I' || ch == 'i')
            return ch + " is a vowel.";
        else if (ch == 'O' || ch == 'o')
            return ch + " is a vowel.";
        else if (ch == 'U' || ch == 'u')
            return ch + " is a vowel.";
        else
            return ch + " is a consonant.";
    }

    public String control(){

        for (int x = 0; x < 10; ++x) {

            if (x == 1) {
                //Is an infinite loop
                for (int y = 10; y < 20; --y) {
                    //Created this so it can "break" out of the infinite loop
                    if (y == 0) {
                        break;
                    }
                }
            }

            if (x == 5) {
                continue;
            }

            if(x == 9){
                return "Inside return";
            }
        }
        return "Outside return";
    }
}