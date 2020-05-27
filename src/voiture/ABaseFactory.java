package voiture;

public abstract class ABaseFactory {
	
	public abstract Vehicle createRegisteredVehicle();
	public abstract Vehicle createUnRegisteredVehicle();
	
	
	
	public ABaseFactory getCarFactory(FactoryType factoryType) {
		if(FactoryType.CAR.equals(factoryType)) {
			return new CarFactory();
		}
		return new TruckFactory();
	}
	
	

	
	private enum FactoryType{
		CAR,TRUCK;
	}
}
