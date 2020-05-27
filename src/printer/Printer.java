package printer;

public class Printer {

	public int id;
	public String brand;
	
	public Printer(int id, String brand) {
		this.id=id;
		this.brand = brand;
	}
	
	public void print(String text) {
		PrinterCentralizer.getInstance();
		
		
		System.out.println("Printer.print() "+text);
	}
	
	
}
