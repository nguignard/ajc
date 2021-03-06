package voiture;

import voiture.ABaseFactory.FactoryType;
import voiture.UnregistredTrailedCar.TrailSize;

public class ApplicationVehicles {

	public static void main(String[] args) {
		Parking<Vehicle> pAll = new Parking<>("Jean Jaures Public");
		Parking<Car> pCars = new Parking<Car>("Jean Jaures Truck");
		Parking<Truck> pTrucks = new Parking<>("Jean Jaures Car");
		UnregisteredCar voiture = new UnregisteredCar("Peugeot");

		Cache cache = new Cache();

		CitySign citySign = new CitySign("parkingAll");
		pAll.attached(citySign);

		addVehicles(pAll, pCars, pTrucks, voiture);

		System.out.println("Parking All: " + pAll.vehicles.size());
		System.out.println("Parking Cars: " + pCars.vehicles.size());
		System.out.println("Parking Trucks: " + pTrucks.vehicles.size());

	        ABaseFactory bf =  ABaseFactory.getCarFactory(FactoryType.CAR);
	        Vehicle rc =   bf.createRegisteredVehicle();

// CLONEABLE
		System.out.println("CLONEABLE ---------------------");

		cache.addVehicleInCache(pAll);
		
		for (Vehicle vehicle : cache.getParkedVehicles()) {
		    System.out.println(vehicle.brand);
		    System.out.println(pAll.vehicles.contains(vehicle));
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

// BRIDGE
		System.out.println("BRIDGE ---------------------");

		UnregistredCustomCar customCar = new UnregistredCustomCar(new UnregisteredCar("Peugeot"), 1, "comment");
		UnregistredTrailedCar trailedCar2 = new UnregistredTrailedCar(new UnregisteredCar("Peugeot"),
			TrailSize.LARGE);

		System.out.println("trailedCar2" + trailedCar2.getTollGatePrice());


// OBSERVER
		System.out.println("OBSERVER ---------------------");
		pAll.exit(voiture);

// STATES
		System.out.println("STATES ---------------------");

		pAll.closeParking();
		pAll.openParking();
		//
	    }


	    private static void addVehicles(Parking<Vehicle> pAll, Parking<Car> pCars, Parking<Truck> pTrucks,
		    UnregisteredCar voiture) {

	    pAll.park(voiture);
	    pAll.park(new RegisteredCar("Peugeot"));
	    pAll.park(new UnregisteredTruck("Peugeot"));
	    pAll.park(new RegisteredTruck("Peugeot"));

	    pCars.park(new UnregisteredCar("Peugeot"));
	    pCars.park(new RegisteredCar("Peugeot"));

	    pTrucks.park(new UnregisteredTruck("Peugeot"));
	    pTrucks.park(new RegisteredTruck("Peugeot"));
	}
}
