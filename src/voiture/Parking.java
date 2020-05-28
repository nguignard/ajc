package voiture;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Parking<T> extends ASubject {

    private String code;
    public String name;
    public int capacity = 3;
    public Set<T> vehicles = new HashSet();
    public Queue waiting;

    public Parking(String name) {
        this.name = name;
    }

    public void park(T vehicle) {
	this.vehicles.add(vehicle);
    }

    public void exit(T vehicle) {
	this.vehicles.remove(vehicle);
    }

    public Integer calculateTotalPrice(){
        return vehicles.stream()
                .filter(vehicle -> vehicle instanceof TollGatePayable)
                .mapToInt(v ->( (TollGatePayable) v).getTollGatePrice())
                .sum();
    }

    @Override
    public void notiffyAll() {
	// TODO Auto-generated method stub

    }

    @Override
    public void attached(AObserver observer) {
	// TODO Auto-generated method stub

    }
}