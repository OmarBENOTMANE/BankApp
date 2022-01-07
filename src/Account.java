
public abstract class Account implements IRate {

	// list common properties for saving & checking account
	String name;
	String sSN;
	double balance;
	protected String accountNumber;
	protected double rate;
	private static int uniqueID = 10000;

	// constructor to init the accout props
	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		//System.out.println("name: " + name + " --sSN: " + sSN + " --balance: $" + balance);
		// set account number
		uniqueID++;
		this.accountNumber = setAccountNumber();
		setRate();
	}
	public abstract void setRate();

	private String setAccountNumber() {
		String lastTwoSSN = sSN.substring(sSN.length() - 2, sSN.length());
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoSSN + uniqueID + randomNumber;
	}
	// list common method
	public void showInfo() {
		System.out.println("name= " + name +"\nbalance= "+balance+ "\naccountNumber= " + accountNumber + "\nRate: "+rate+"%");
	}
	public void compound() {
		double accruedInterest = balance * (rate/100);
		balance = balance + accruedInterest;
		System.out.println("Accrued interest: $"+accruedInterest);
		printBalance();
	}
	public void deposit(double amount) {
		balance = balance + amount;
		printBalance();
	}
	public void withdraw(double amount) {
		System.out.println("you pull "+amount+"$");
		balance = balance - amount;
		printBalance();
	}
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("transfering "+ amount+ " to "+ toWhere);
		printBalance();
	}
	public void printBalance() {
		System.out.println("your balance is $"+balance);
	}
	
}
