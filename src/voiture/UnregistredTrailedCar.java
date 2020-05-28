package voiture;

public class UnregistredTrailedCar extends UnregistredCarDecorator {

    TrailSize trailSize;

    public UnregistredTrailedCar(UnregisteredCar car, TrailSize trailSize) {
	super(car);
	this.trailSize = trailSize;
    }

    @Override
    public int getTollGatePrice() {
	int addedPrice = 0;
	switch (trailSize) {
	case SMALL:
	    addedPrice = 1;
	    break;
	case MEDIUM:
	    addedPrice = 3;
	    break;
	case LARGE:
	    addedPrice = 5;
	    break;
	default:
	    break;
	}
	    return addedPrice;
    }

    private enum TrailSize {
	SMALL, MEDIUM, LARGE
    }


}
