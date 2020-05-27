package printer;

public class Computer {

private int id;
private String name;

public Computer(int id, String name) {
	this.id = id;
	this.name = name;
}

public void print(int id,String name) {
	PrinterCentralizer.getInstance();
}


}
