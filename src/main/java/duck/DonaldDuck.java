package duck;

/**
 *
 * @author pasoktummarungsri
 */
public class DonaldDuck extends Duck {

    public DonaldDuck(int age) {
        super(age);
    }
    
    @Override
    public String toString() {
        return "DD: " + age;
    }

    @Override
    public void bark() {
        System.out.println("quark quark");
    }
}
