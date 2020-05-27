package voiture;

public  class CarFactory extends ABaseFactory{

	@Override
	public Vehicle createRegisteredVehicle() {
		return new RegisteredCar("ReCar");
	}

	@Override
	public Vehicle createUnRegisteredVehicle() {
		return new UnregisteredCar("UNreCar");
	}
	
	

}
