package duck;

/**
 *
 * @author pasoktummarungsri
 */
public class TealDuck extends Duck implements FlyDuck {
    
    private FlyBehavior unusebehavior = new FlyBehavior() {
        @Override
        public String doFly() {
            return "noname wing";
        }
    };
    
    private FlyBehavior flyBehavior = () -> {
        int v = 1;
        return "noname wing v" +v;
    };
    
    public TealDuck(int age) {
        super(age);
    }
    
    @Override
    public String toString() {
        return "TD: " + age;
    }
    
    @Override
    public void bark() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
