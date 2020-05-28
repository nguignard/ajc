package Bank;

public class CardReader implements TransactionInfo {

    private Card card;
    private int i = 0;

    public CardReader() {
    }

    @Override
    public void startTransactionInfo(Card card) {
	card.connect();
    }


}
