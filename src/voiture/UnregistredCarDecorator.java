package voiture;

public abstract class UnregistredCarDecorator implements TollGatePayable {

    UnregisteredCar car;

    public UnregistredCarDecorator(UnregisteredCar car) {
	this.car = car;
    }


}
