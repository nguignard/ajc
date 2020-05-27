package voiture;



import java.util.Scanner;

public class UnregisteredTruck extends Truck implements TollGatePayable {

    public UnregisteredTruck(String brand) {
        super(brand);
    }

    @Override
    public int getTollGatePrice() {
        return 5;
    }

	@Override
	public void sayHello2() {
		// TODO Auto-generated method stub
		
	}
}