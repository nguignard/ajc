package voiture;

public class RegisteredCar extends Car {

    public RegisteredCar(String brand) {
        super(brand);
    }

	@Override
	public void sayHello2() {
	System.out.println("Hello2 "+this.getClass().getSimpleName());
		
	}
}