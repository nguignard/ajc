package voiture;

public class OpenState implements State {

    @Override
    public void getMessage(Parking p) {
	System.out.println("parking " + p.parkigName + " is " + this.getClass().getSimpleName());

    }

}
