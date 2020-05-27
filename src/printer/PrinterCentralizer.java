package printer;

import java.util.ArrayList;
import java.util.List;

public class PrinterCentralizer {

	private static PrinterCentralizer INSTANCE = null;
	private List<Printer> printers = new  ArrayList<Printer>();
	
	private PrinterCentralizer() {
	}
	
	public void addPrinter(Printer printer) {
		printers.add(printer);
	}

	public void print(String text) {
	int	i =0;
	Printer printer;
		while(i<printers.size()) {
			printers.get(i++).print(text);
		}

		
		
		
		
	}

	public static PrinterCentralizer getInstance() {
		if (INSTANCE == null)
        {   INSTANCE = new PrinterCentralizer(); 
        }
        return INSTANCE;
	}
	
	
		
	
}
