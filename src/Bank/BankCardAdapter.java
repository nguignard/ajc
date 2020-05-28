package Bank;

public class BankCardAdapter implements IAdapter {

    private BankCard bankCard;


    public BankCardAdapter(BankCard bankCard) {
	this.bankCard = bankCard;
    }


    @Override
    public void connect() {
	bankCard.startTransaction();
    }

}
