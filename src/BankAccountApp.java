import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {

		Checking checking1 = new Checking("boba", "12345", 1500);
		Savings saving1 = new Savings("bobi", "54321", 2500);

		checking1.showInfo();
		System.out.println("------------------------------");
		saving1.showInfo();
		System.out.println("//////////////////////////////////////////////");
		saving1.compound();
		saving1.deposit(5000);
		saving1.withdraw(200);
		saving1.transfer("SOMEBODY", 3000);
		System.out.println("////////////////////////////////////////////////");

// Read csv file then create account base on data
		String file = "C:\\Users\\X1\\eclipse-workspace\\StudentDbApp\\BankAccount.csv";
		List<String[]> newAccountHolders = CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			System.out.println("New Account");
			System.out.println(
					accountHolder[0] + " " + accountHolder[1] + " " + accountHolder[2] + " " + accountHolder[3]);
			System.out.println("---------------------------------------");
		}
		System.out.println("////////////////////////////////////////////////");
		List<Account> accounts = new LinkedList<Account>();
		for (String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String sSn = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, sSn, initDeposit));
			} else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, sSn, initDeposit));
			} else
				System.out.println("Error reading account type");
		}
		for (Account acc : accounts) {
			acc.showInfo();
			System.out.println("\n***********");
			
		}
	}
}
