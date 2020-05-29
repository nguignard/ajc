package voiture;

public class CloseState implements State {

    @Override
    public void getMessage(Parking p) {
	System.out.println("parking " + p.parkigName + " is " + this.getClass().getSimpleName());

    }

}
