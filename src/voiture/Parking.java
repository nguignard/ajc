package voiture;

public class Parking {

	private String code ="";
	public String name ="";
	public int capacity = 15;
	
	public Parking(String name, String code) {
		this.name = name;
		this.code = code;
		TollGate tollGateIn = new TollGate(Direction.IN, Orientation.WEST);
		TollGate tollgateOut = new TollGate(Direction.OUT, Orientation.EAST);
		
		}
	
	public void add(Vehicules vehicule) {
		
	}
	public void calculateTotalPrice() {
		
	}
	
	
	public class TollGate {
		public String id = "";
		public boolean enable = true;
		private Direction direction;
		private Orientation orientation;
			
		public TollGate(Direction direction, Orientation orientation) {	
			this.direction=direction;
			this.orientation=orientation;
			this.id= code.
			}
	
}
	
	
	private  enum Direction{
		IN,OUT,INOUT;
	}
		
	private  enum Orientation{
		NORTH,SOUTH,WEST,EAST;
	}
			
		

	
	
	
	
	
}
