package voiture;

import java.util.Scanner;

public abstract class Vehicle implements IVehicleFactory {

    private static long count = 0;
    public final long ID = count++;
    public String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }
}