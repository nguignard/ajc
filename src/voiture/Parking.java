package voiture;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Parking<T> extends ASubject {

    private String code;
    public String parkigName;
    public int capacity = 3;
    public Set<T> vehicles = new HashSet();
    public Queue waiting;
    private ASubject subject;
    private AObserver observer;


    public Parking(String parkingName) {
	this.parkigName = parkingName;
	observer = new CitySign("info");
	subject.attached(observer);
    }

    public void park(T vehicle) {
	this.vehicles.add(vehicle);
	subject.notiffyAll(this.parkigName + " left: " + (capacity - this.vehicles.size()));

    }

    public void exit(T vehicle) {
	this.vehicles.remove(vehicle);
	subject.notiffyAll(this.parkigName + " left: " + (capacity - this.vehicles.size()));
    }

    public Integer calculateTotalPrice(){
        return vehicles.stream()
                .filter(vehicle -> vehicle instanceof TollGatePayable)
                .mapToInt(v ->( (TollGatePayable) v).getTollGatePrice())
                .sum();
    }

}