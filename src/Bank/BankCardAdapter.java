package Bank;

public class BankCardAdapter implements Card {

    private BankCard bankCard;

    public BankCardAdapter(BankCard bankCard) {
	this.bankCard = bankCard;
    }

    @Override
    public void connect() {
	bankCard.startTransaction();
    }

    @Override
    public String getCode() {
	// TODO Auto-generated method stub
	return null;
    }

}
