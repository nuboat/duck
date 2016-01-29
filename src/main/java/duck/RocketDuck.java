package duck;

/**
 *
 * @author pasoktummarungsri
 */
public class RocketDuck extends Duck implements FlyDuck {
    
    private FlyBehavior flyBehavior = new FlyWithRocket();
    
    public RocketDuck(int age) {
        super(age);
    }
    
    /**
     * <p>This method will show you specie of this duck.
     * 
     * @return String
     */
    @Override
    public String toString() {
        return "RD: " + age;
    }

    @Override
    public void bark() {
        System.out.println("falsssse");
    }
    
    @Override
    public void walk() {
        throw new IllegalStateException("I can't Walk.");
    }
    
    @Override
    public String fly() {
        return flyBehavior.doFly();
    }
    
    @Override
    public void changeFlyBehavior(final FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
