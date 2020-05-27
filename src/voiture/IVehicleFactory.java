package voiture;

public interface IVehicleFactory<T> {

	public T createVehicle(T vehicleType, String brand, String plate);
	
	
}
