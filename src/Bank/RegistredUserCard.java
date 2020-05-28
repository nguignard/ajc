package Bank;

public class RegistredUserCard implements Card {

    private String accountNumber;

    public RegistredUserCard(String accountNumber) {
	this.accountNumber = accountNumber;
    }

    @Override
    public void connect() {
	System.out.println("RegistredUserCard: " + accountNumber);
    }

    @Override
    public String getCode() {
	// TODO Auto-generated method stub
	return null;
    }

}
