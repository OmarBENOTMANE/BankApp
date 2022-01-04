
public class BankAccountApp {

	public static void main(String[] args) {

		Checking checking = new Checking("boba", "12345", 1500);
		//System.out.println("-------------------------------------------");
		Savings saving = new Savings("bobi", "54321", 2500);
		//System.out.println("////////////////////////////////////////////////");
		
		checking.showInfo();
		System.out.println("------------------------------");
		saving.showInfo();
		// Read csv file then create account base on data

	}

}
