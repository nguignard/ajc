package printer;

import java.util.ArrayList;
import java.util.List;

public class PrinterCentralizer {

	private static PrinterCentralizer INSTANCE = null;
	private List<Printer> printers = new  ArrayList<Printer>();
	int	i = 0;
	
	private PrinterCentralizer() {
	}
	
	public void addPrinter(Printer printer) {
		printers.add(printer);
	}

	public void print(String text) {
		printers.get(i++).print(text);
		if(i>=printers.size()) {
			i=0;
		}
	}

	public static PrinterCentralizer getInstance() {
		if (INSTANCE == null)
        {   INSTANCE = new PrinterCentralizer(); 
        }
        return INSTANCE;
	}
	
	
		
	
}
