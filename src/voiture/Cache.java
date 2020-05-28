package voiture;

import java.util.HashSet;
import java.util.Set;

public class Cache<T> {

    private Set<T> vehicles = new HashSet<T>();
		
	public Cache() {
	    
	}

	public void addVehicleInCache(Set<T> newVehicles) {
	    for (T vehicle : newVehicles) {

		vehicles.add(vehicle.clone());
	    }
	}


}
