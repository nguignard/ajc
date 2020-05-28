package voiture;

import java.util.ArrayList;
import java.util.List;

public abstract class ASubject {

    public List<AObserver> observers = new ArrayList<AObserver>();
    private String message;

    public void notiffyAll(String message) {
	for (AObserver observer : observers) {
	    observer.update(message);
	}
    }

    public void attached(AObserver observer) {
	observers.add(observer);
    }


}
