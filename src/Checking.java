
public class Checking extends Account {

	// list common properties for saving & checking account
	int debitCardNumber;
	int debitCardPin;

	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		// System.out.println("new checking account ");
		// System.out.println("the account number is: " + this.accountNumber);
		setDebitCard();
	}

	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}

	public void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}

	public void showInfo() {
		System.out.println("Account type: CHEKING");
		super.showInfo();
		System.out.println("DebitCard Nunber: " + debitCardNumber);
		System.out.println("DebitCard PIN: " + debitCardPin);
	}
}
