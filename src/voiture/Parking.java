package voiture;

import java.util.ArrayList;
import java.util.List;

import com.sun.jdi.IntegerValue;

public class Parking<T> implements Comparable<Parking>{

	private String code ="";
	public String name ="";
	public int capacity = 15;
	
	private List<TollGate> tollGates = new ArrayList<TollGate>();
	private List<T> vehicules = new ArrayList<T> ();
	
	public Parking(String name, String code) {
		this.name = name;
		this.code = code;
		this.tollGates.add( new TollGate(Direction.IN, Orientation.WEST));
		this.tollGates.add( new TollGate(Direction.OUT, Orientation.EAST));
	}
	
	public void add(T vehicule) {
		this.vehicules.add(vehicule);
	}
	
	public void calculateTotalPrice() {
		
	}
	
	
	public class TollGate {
		private int count = 0;
		public String id = "";
		public boolean enable = true;
		private Direction direction;
		private Orientation orientation;
			
		public TollGate(Direction direction, Orientation orientation) {	
			this.direction=direction;
			this.orientation=orientation;
			this.id= code+"#"+count++;
			}
	
}
	
	
	private  enum Direction{
		IN,OUT,INOUT;
	}
		
	private  enum Orientation{
		NORTH,SOUTH,WEST,EAST;
	}

	

	@Override
	public int compareTo(Parking o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
			
		

	
	
	
	
	
}
