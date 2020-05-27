package voiture;

public class UnregisteredCar extends Car implements TollGatePayable{

    public UnregisteredCar(String brand) {
        super(brand);
    }

    @Override
    public int getTollGatePrice() {
        return 3;
    }

	@Override
	public void sayHello2() {
		System.out.println("Hello2 "+this.getClass().getSimpleName());
	}

	
}