package voiture;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Parking<T> {

	String name;
	private String code;
    public int capacity = 3;
    
    Set<T> vehicles = new HashSet();

    public Parking(String name) {
        this.name = name;
    }

    public void add(T vehicle) {
        this.vehicles.add(vehicle);
    }

    public Integer calculateTotalPrice(){
        return vehicles.stream()
                .filter(vehicle -> vehicle instanceof TollGatePayable)
                .mapToInt(v ->( (TollGatePayable) v).getTollGatePrice())
                .sum();
    }
}