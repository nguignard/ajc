package voiture;

import java.util.HashSet;
import java.util.Set;

public class Cache {

    private Set<Vehicle> cacheddVehicles = new HashSet<Vehicle>();
		
	public Cache() {
	}

	public void addVehicleInCache(Parking<Vehicle> parking) {
	    Set<Vehicle> vehicles = parking.vehicles;
	    
	    for (Vehicle vehicle : vehicles) {
		try {
		    cacheddVehicles.add(vehicle.clone());
		} catch (CloneNotSupportedException e) {
		    e.printStackTrace();
		}
	    }
	}

	public Set<Vehicle> getParkedVehicles() {
	    return this.cacheddVehicles;
}

}
