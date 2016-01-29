package thjug;

import duck.DonaldDuck;
import duck.Duck;
import duck.FlyDuck;
import duck.FlyWithWing;
import duck.RocketDuck;
import duck.TealDuck;


/**
 *
 * @author pasoktummarungsri
 */
public class DuckWrld {
    
    public void whoami(final Duck duck) {
        System.out.println(duck.toString());
    }
    
    public void bark(final Duck duck) {
        duck.bark();
    }
    
    public void walk(final Duck duck) {
        duck.walk();
    }
    
    public void fly(final FlyDuck duck) {
        System.out.println(duck.fly());
    }
    
    public void run() {
        Duck duck1 = new DonaldDuck(1);
        whoami(duck1);
        bark(duck1);
        walk(duck1);
        
        Duck duck2 = new RocketDuck(1);
        whoami(duck2);
        bark(duck2);

        FlyDuck tealDuck = new TealDuck(1);
        fly(tealDuck);
        
        FlyDuck rocketDuck = new RocketDuck(1);
        fly(rocketDuck);
        
        rocketDuck.changeFlyBehavior(() -> "Yo !");
        fly(rocketDuck);
        
        RocketDuck rrrr = (RocketDuck) rocketDuck;
    }
    
    public static void main(String[] args) {
        new DuckWrld().run();
    }

}
