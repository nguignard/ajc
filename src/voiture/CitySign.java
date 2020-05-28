package voiture;

public class CitySign extends AObserver {

    public int id;
    public String info;

    public CitySign(String info) {
	this.info = info;
    }

    @Override
    public void update(String message) {
	System.out.println(message);
    }

}
