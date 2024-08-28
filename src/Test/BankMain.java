package Test;
class BankAccount{
	private String AccountHolderName;
	private String AccountNumber;
	private double balance;
	
	public BankAccount(String AccountHolderName, String AccountNumber,int balance) {
		this.balance = balance;
		this.AccountNumber = AccountNumber;
		this.AccountHolderName = AccountHolderName;
	}
	
	public void Deposite(double amount) {
		if(amount > 0) {
			balance = balance + amount;
			System.out.println("Deposite : $ "+amount);
		}
		else {
			System.out.println("This is invalid amount");
		}
	}
	
	public void Withdrawl(double amount) {
		if(amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawl : $ "+amount);
		}
		else {
			System.out.println("This is invalid withdrawl amount");
		}
	}
	
	public double getbalance() {
		return balance;
	}
	public String getAccountHolderName() {
		return AccountHolderName;
		
	}
	public String getAccountNumber() {
		return AccountNumber;
		
	}
	public void setAccountHolderName(String AccountHolderName) {
		this.AccountHolderName = AccountHolderName;
	}
}
class BankMain{
	public static void main(String[]args) {
		BankAccount bankAccount = new BankAccount("Nayan Wadgaonkar", "1234566",5000 );
		System.out.println("AccountHolderName : "+bankAccount.getAccountHolderName()); 
		System.out.println("Account Number : " +bankAccount.getAccountNumber());
		System.out.println("Account balance : "+ bankAccount.getbalance());
		
		bankAccount.Deposite(100000);
		System.out.println("Account balance : "+ bankAccount.getbalance());
		bankAccount.Withdrawl(500);
		System.out.println("Account balance : "+ bankAccount.getbalance());
		
	}
}