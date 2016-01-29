package sort;

import duck.DonaldDuck;
import duck.Duck;
import duck.RocketDuck;
import duck.TealDuck;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author pasoktummarungsri
 */
public class DuckSort {
    
    public static void main(String[] args) {
        List list = Arrays.asList(new DonaldDuck(1), 
                new RocketDuck(2), 
                new TealDuck(1), 
                new DonaldDuck(3));
        
        System.out.println(list.toString());
        
        Collections.sort(list, (Duck o1, Duck o2) -> o1.compare(o2));
        
        System.out.println(list.toString());   
    }
    
}
