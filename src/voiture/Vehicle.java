package voiture;

public abstract class Vehicle implements Cloneable {

    private static long count = 0;
    public final long ID = count++;
    public String brand;

    public Vehicle(String brand) {
        this.brand = brand;
		sayHello();
    }
    
    private void sayHello() {
    	System.out.println("Hello "+this.getClass().getSimpleName());
		
	}
    
	@Override
	public Vehicle clone() throws CloneNotSupportedException {
	    return (Vehicle) super.clone();
	};

 }