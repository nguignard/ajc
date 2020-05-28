package voiture;

import voiture.ABaseFactory.FactoryType;
import voiture.UnregistredTrailedCar.TrailSize;

public class ApplicationVehicles {

	public static void main(String[] args) {
		Parking<Vehicle> pAll = new Parking<>("Jean Jaures Public");
		Parking<Car> pCars = new Parking<Car>("Jean Jaures Truck");
		Parking<Truck> pTrucks = new Parking<>("Jean Jaures Car");

		pAll.add(new UnregisteredCar("Peugeot"));
		pAll.add(new RegisteredCar("Peugeot"));
		pAll.add(new UnregisteredTruck("Peugeot"));
		pAll.add(new RegisteredTruck("Peugeot"));

		pCars.add(new UnregisteredCar("Peugeot"));
		pCars.add(new RegisteredCar("Peugeot"));

		pTrucks.add(new UnregisteredTruck("Peugeot"));
		pTrucks.add(new RegisteredTruck("Peugeot"));

		System.out.println("Parking All: " + pAll.vehicles.size());
		System.out.println("Parking Cars: " + pCars.vehicles.size());
		System.out.println("Parking Trucks: " + pTrucks.vehicles.size());

	        ABaseFactory bf =  ABaseFactory.getCarFactory(FactoryType.CAR);
	        Vehicle rc =   bf.createRegisteredVehicle();

		// CLONEABLE
		System.out.println("CLONEABLE ---------------------");
		Cache cache = new Cache();
		cache.addVehicleInCache(pAll);
		
		for (Vehicle vehicle : cache.getParkedVehicles()) {
		    System.out.println(vehicle.brand);
		}


		// DECORATOR
		System.out.println("DECORATOR ---------------------");
		UnregistredCustomCar custCar = new UnregistredCustomCar(
			new UnregisteredCar("Peugeot"),
			1, "comment"
			);
		UnregistredTrailedCar trailedCar = new UnregistredTrailedCar(
			new UnregisteredCar("Peugeot"),
			TrailSize.LARGE
			);
		

			System.out.println(custCar.getTollGatePrice());
			
			System.out.println(trailedCar.getTollGatePrice());

}
}
