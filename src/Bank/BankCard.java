package Bank;

public class BankCard {

    private String accountNumber;

    public BankCard(String accountNumber) {
	this.accountNumber = accountNumber;
    }
    
    public void startTransaction() {
	System.out.println("BankCard: " + accountNumber);
    }
    
}
