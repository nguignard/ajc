package printer;

import java.util.ArrayList;
import java.util.List;

import voiture.ABaseFactory.FactoryType;

public class Application {

	public static void main(String[] args) {

List<Printer> printers = new ArrayList<Printer>();
List<Computer> computers = new ArrayList<Computer>();
		
for(int i =0;i<6; i++) {
	computers.add(new Computer(i,String.valueOf(i)));
}

printers.add(new Printer(0, "epson"));
printers.add(new Printer(0, "canon"));
printers.add(new Printer(0, "fuji"));		

		
	}
}
