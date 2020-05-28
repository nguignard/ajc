package voiture;

public abstract class Car extends Vehicle implements ParkableCar {
    public Car(String brand) {
        super(brand);
    }
}
