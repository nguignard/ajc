package voiture;

public class UnregisteredTruck extends Truck implements TollGatePayable {

    public UnregisteredTruck(String brand) {
        super(brand);
    }

    @Override
    public int getTollGatePrice() {
        return 5;
    }

}