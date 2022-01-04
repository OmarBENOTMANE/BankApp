
public abstract class Account implements IRate {

	// list common properties for saving & checking account
	String name;
	String sSN;
	double balance;
	String accountNumber;
	double rate;
	static int index = 10000;

	// constructor to init the accout props
	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		//System.out.println("name: " + name + " --sSN: " + sSN + " --balance: $" + balance);
		// set account number
		index++;
		this.accountNumber = setAccountNumber();
	}

	private String setAccountNumber() {
		String lastTwoSSN = sSN.substring(sSN.length() - 2, sSN.length());
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoSSN + index + randomNumber;
	}
	// list common method
	public void showInfo() {
		System.out.println("name= " + name + "\nbalance= " + balance + "\naccountNumber= " + accountNumber);
	}

	
}
