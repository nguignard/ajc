package Bank;

public class CardReaderProxy implements TransactionInfo {
    private Card card;
    private int i = 0;

    public CardReaderProxy(Card card) {
	this.card = card;
    }

    @Override
    public void startTransactionInfo(Card card) {
	if (i < 3) {
	    System.out.println("CardReader n° " + i);
	} else {
	    System.out.println("Stop");
	}
    }


}
