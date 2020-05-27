package printer;

import java.util.ArrayList;
import java.util.List;

import voiture.ABaseFactory.FactoryType;

public class Application {
	public static void main(String[] args) {
	
		
		
	List<Computer> computers = new ArrayList<Computer>();
	PrinterCentralizer printerCentralizer = PrinterCentralizer.getInstance();	
	
	
	for(int i =0;i<6; i++) {
		computers.add(new Computer(i,String.valueOf(i)));
	}
	
	printerCentralizer.addPrinter(new Printer(0, "epson"));
	printerCentralizer.addPrinter(new Printer(1, "canon"));
	printerCentralizer.addPrinter(new Printer(2, "fuji"));
	
	for(Computer computer :computers){
		computer.print("text");
	}


	}
}
