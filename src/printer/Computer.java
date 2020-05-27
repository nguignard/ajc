package printer;

public class Computer {

private int id;
private String name;
PrinterCentralizer printerCentralizer = PrinterCentralizer.getInstance();	


public Computer(int id, String name) {
	this.id = id;
	this.name = name;
}

public void print(String text) {
	printerCentralizer.print(text);
}


}
