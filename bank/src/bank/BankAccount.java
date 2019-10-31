package bank;
import java.util.Arrays;
import java.util.Random;


public class BankAccount {
	private String accountNumber;
	private double checkingBal;
	private double saveingBal;
	private static int numberAccounts = 0;
	private static double allAccountsBal = 0; 
	
	public BankAccount(double check, double save) {
		this.accountNumber = randomAccNumber();
		this.checkingBal = check;
		this.saveingBal = save;
		this.numberAccounts +=1;
	}
	
	private String randomAccNumber() {
		 Random rnd = new Random();
		 int[] digits = new int[10];
		 for(int i=0; i< 10; i++) {
			 digits[i] = rnd.nextInt(10);
		 }		 
		 return Arrays.toString(digits);
	}
//	● Create a getter method for the user's checking account balance.
	public double getCheckingAccountBalance() {
		return this.checkingBal;
	}
	
//	● Create a getter method for the user's saving account balance.
	public double getSavingsBalance(){
		return this.saveingBal;
	}

//	● Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
	public void depositChecking(double deposit) {
		this.checkingBal += deposit;
		allAccountsBal +=deposit;
	}
	public void depositSavings(double deposit) {
		this.saveingBal += deposit;
		allAccountsBal +=deposit;
	}

//	● Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
	public void withdrawChecking(double withdrawl) {
		this.checkingBal -= withdrawl;
		allAccountsBal -= withdrawl;
	}
	public void withdrawsavings(double withdrawl) {
		this.saveingBal -= withdrawl;
		allAccountsBal -= withdrawl;
	}
//	● Create a method to see the total money from the checking and saving.
	public double bankBalance(){
		return this.allAccountsBal;
	}
	public int accountCount(){
		return this.numberAccounts;
	}

//	● Users should not be able to set any of the attributes from the class.
	
	
}
