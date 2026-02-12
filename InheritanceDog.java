package teluskolearnings;

public class InheritanceDog extends InheritanceAnimal {
	public void bark() {
        System.out.println("Dog barks from Dog Class");
    }

    public void run1() {
        System.out.println("Dog runs from Dog Class");
    }
    
    @Override
    public void run() {
    	System.out.println("Running in Dog Class");
    }
}
