import java.util.Date;


public class Account {
	private static int id;
	private static double balance;
	private static double annualInterestRate;
	private static Date dateCreated;
	
	
	public Account(int id, double balance, double annualInterestRate,
			Date dateCreated) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Account.id = id;
	}

	public static double getBalance() {
		return balance;
	}

	public static void setBalance(double balance) {
		Account.balance = balance;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}
	public static Date getdateCreated() {
		return dateCreated; 
	}
	public static double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	public double deposit(double amount2) {
		return balance + amount2;
	}

	public void withdraw (double amount1) throws InsufficientFundsException {
		if (amount1 <= balance) {
			balance -= amount1;
		}
		else {
			double shortnum = amount1 - balance;
			throw new InsufficientFundsException(shortnum);
	}
}
}
