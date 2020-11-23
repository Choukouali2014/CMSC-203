
public class SavingsAccount extends BankAccount {
	private double rate=0.025;
	private int savingNumber=0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name,amount);
		accountNumber = super.getAccountNumber()+"-"+ this.savingNumber;
	}
	
	public SavingsAccount(SavingsAccount oldAccount,double amount) {
		super(oldAccount,amount);
		accountNumber = super.getAccountNumber()+"-"+ ++this.savingNumber;

	}
	
	public void postInterest() {
		setBalance(getBalance() + (getBalance() * (this.rate) *(1.0/12)));
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
}
