package course.review.services;

import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class LoopsService {

    public void forLoop(){
        for (int i = 0; i < 10; i++){
            System.out.println("This is a for loop.");
        }
    }

    public void enhancedForLoop(){
        ArrayList<String> items = new ArrayList<String>();

        items.add( "EFL" );    items.add( "EFL" );
        items.add( "EFL" );    items.add( "EFL" );
        items.add( "EFL" );    items.add( "EFL" );
        items.add( "EFL" );    items.add( "EFL" );

        for ( String nm : items )
            System.out.println( nm );
    }

    public void whileLoop(){
        int x = 0;
        while( x < 10 ) {
            System.out.print("This is a While Loop");
            x++;
            System.out.print("\n");
        }
    }

    public void doWhileLoop(){
        int x = 0;
        do {
            System.out.print("This is a Do-While Loop");
            x++;
            System.out.print("\n");
        }while( x < 10 );
    }
}