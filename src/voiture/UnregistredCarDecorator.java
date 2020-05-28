package voiture;

public abstract class UnregistredCarDecorator implements TollGatePayable, ParkableCar {

    UnregisteredCar car;

    public UnregistredCarDecorator(UnregisteredCar car) {
	this.car = car;
    }


}
