
public class CheckingAccount extends BankAccount {
	private final double FEE=0.15;
	
	public CheckingAccount(String name, double amount) {
		super(name,amount); 
		setAccountNumber(getAccountNumber()+"-10");
	}
	
	public boolean withdraw(double amount) {
		if(amount - this.FEE >0) {
			setBalance(getBalance()-amount-this.FEE);
			return true ;
		}
				
		return false;
	}
}
