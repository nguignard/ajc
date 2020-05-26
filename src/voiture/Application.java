package voiture;

public class Application {

	public static void main(String[] args) {
			System.out.println("Application.main()");
							
			Parking<Vehicle>  parkingAll = new Parking<>("JeanP", "JPP");
			Parking<Car>  parkingCars = new Parking<Car>("JeanT", "JPT");
			Parking<Truck>  parkingTrucks = new Parking<Truck>("JeanC", "JPC");
				
			
			System.out.println("parkingAll"+parkingAll.toString());
			System.out.println("parkingCars"+parkingCars.toString());
			System.out.println("parkingTrucks"+parkingTrucks.toString());
				
			
			
			
			
			
			
	}

}
