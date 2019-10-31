package bank;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount drumph = new BankAccount(100,100);
		
		drumph.depositChecking(500);
		drumph.depositSavings(300);
		
		System.out.println("Checking: "+drumph.getCheckingAccountBalance());
		System.out.println("Savings: "+drumph.getSavingsBalance());
		System.out.println("Total: "+drumph.bankBalance());
		System.out.println("Number of accounts: "+drumph.accountCount());
		
		drumph.withdrawChecking(200);
		drumph.withdrawsavings(20);
		
		System.out.println("Checking: "+drumph.getCheckingAccountBalance());
		System.out.println("Savings: "+drumph.getSavingsBalance());
		System.out.println("Total: "+drumph.bankBalance());
		System.out.println("Number of accounts: "+drumph.accountCount());
	}
	

}
