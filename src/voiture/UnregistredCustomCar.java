package voiture;

public class UnregistredCustomCar extends UnregistredCarDecorator {

    private int extraFees;
    private String comment;

    public UnregistredCustomCar(UnregisteredCar car, int extraFees, String comment) {
	super(car);
	this.extraFees = extraFees;
	this.comment = comment;
    }

    @Override
    public int getTollGatePrice() {
	return 0;
    }


}
