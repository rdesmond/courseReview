package course.review.services;

import org.springframework.stereotype.Service;

@Service
public class CastNestControlService {

    public void Casting(){
        double d = 100.04;
        long l = (long)d;
        int i = (int)l;
        short s = (short)i;
        byte b = (byte)s;

        System.out.println("Double value " + d);
        System.out.println("Long value " + l);
        System.out.println("Int value " + i);
        System.out.println("Short value " + s);
        System.out.println("Byte value " + b);
    }

    public void Nesting(){
        char ch = 'O';

        if (ch == 'A' || ch == 'a')
            System.out.println(ch + " is vowel.");
        else if (ch == 'E' || ch == 'e')
            System.out.println(ch + " is vowel.");
        else if (ch == 'I' || ch == 'i')
            System.out.println(ch + " is vowel.");
        else if (ch == 'O' || ch == 'o')
            System.out.println(ch + " is vowel.");
        else if (ch == 'U' || ch == 'u')
            System.out.println(ch + " is vowel.");
        else
            System.out.println(ch + " is a consonant.");
    }

    public void Control(){
        System.out.println ("Starting loop:");
        for (int x = 0; x < 10; ++x) {
            System.out.println ("In outside loop: " + x);

            if (x == 1) {
                for (int y = 10; y < 20; --y) {
                    System.out.println("In inside loop: " + y);
                    if (y == 0) {
                        System.out.println("Break");
                        break;
                    }
                }
            }

            if (x == 5) {
                System.out.println ("Continue");
                continue;
            }

            if(x == 9){
                return;
            }
        }
        return;
    }
}