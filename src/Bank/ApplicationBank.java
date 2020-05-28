package Bank;

public class ApplicationBank {

    public static void main(String[] args) {

	CardReader cardReader = new CardReader();
//	Card bankCardAdapter = new BankCard("aaa");
	Card RegistredUserCard = new RegistredUserCard("aa1");
	Card card;

	cardReader.startTransactionInfo(RegistredUserCard);

    }
}
