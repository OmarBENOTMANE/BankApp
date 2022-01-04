
public class Savings extends Account {

	// list common properties for saving & checking account
	int safetyDepositeBoxID;
	int safetyDepositeBoxKey;

	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		//System.out.println("new saving account ");
		//System.out.println("the account number is: " + this.accountNumber);
		setSafetyDepositBox();
	}
	public void setSafetyDepositBox() {
		safetyDepositeBoxID = (int)(Math.random()*Math.pow(10, 3));
		safetyDepositeBoxKey = (int)(Math.random()*Math.pow(10, 4));
	}
	public void showInfo() {
		System.out.println("Account type: SAVING");
		super.showInfo();
		System.out.println("SafetyDepositBox ID: "+safetyDepositeBoxID);
		System.out.println("SafetyDepositBox KEY: "+safetyDepositeBoxKey);
	}

}
