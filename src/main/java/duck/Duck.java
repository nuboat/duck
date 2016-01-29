package duck;

/**
 *
 * @author pasoktummarungsri
 */
public abstract class Duck {
    
    protected final int age;

    public Duck(int age) {
        this.age = age;
    }
    
    public int compare(Duck d2) {
        if (this.age > d2.age) 
            return 1;
        else if (this.age == d2.age)
            return 0;
        else 
            return -1;
    }
    
    public abstract void bark();
    
    public void walk() {
        System.out.println("แตะ แตะ แตะ");
    }
    
    public Integer getAge() {
        return age;
    }
    
}
