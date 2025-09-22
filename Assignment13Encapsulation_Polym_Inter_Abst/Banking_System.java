package Assignment13Encapsulation_Polym_Inter_Abst;
import java.util.*;
	abstract class BankAccount {
	    private String accountNumber;
	    private String holderName;
	    private double balance;
	    public BankAccount(String accountNumber, String holderName, double balance) {
	        this.accountNumber = accountNumber;
	        this.holderName = holderName;
	        this.balance = balance;
	    }
	    public String getAccountNumber() {
	        return accountNumber;
	    }
	    public String getHolderName() {
	        return holderName;
	    }
	    public double getBalance() {
	        return balance;
	    }

	    protected void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
	        } else {
	            System.out.println("Invalid deposit amount!");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
	        } else {
	            System.out.println("Insufficient balance or invalid withdrawal!");
	        }
	    }
	    public abstract double calculateInterest();
	    public void displayDetails() {
	        System.out.println("Account Number: " + accountNumber + 
	                           ", Holder: " + holderName + 
	                           ", Balance: " + balance);
	    }
	}
	interface Loanable {
	    void applyForLoan(double amount);
	    boolean calculateLoanEligibility();
	}
	class SavingsAccount extends BankAccount implements Loanable {
	    private double interestRate = 0.04; // 4%

	    public SavingsAccount(String accountNumber, String holderName, double balance) {
	        super(accountNumber, holderName, balance);
	    }
	    public double calculateInterest() {
	        return getBalance() * interestRate;
	    }
	    public void applyForLoan(double amount) {
	        if (calculateLoanEligibility()) {
	            System.out.println("Loan of " + amount + " approved for Savings Account: " + getHolderName());
	        } else {
	            System.out.println("Loan request denied for Savings Account: " + getHolderName());
	        }
	    }
	    public boolean calculateLoanEligibility() {
	        return getBalance() >= 5000;
	    }
	}
	class CurrentAccount extends BankAccount implements Loanable {
	    private double interestRate = 0.02; 

	    public CurrentAccount(String accountNumber, String holderName, double balance) {
	        super(accountNumber, holderName, balance);
	    }
	    public double calculateInterest() {
	        return getBalance() * interestRate;
	    }
	    public void applyForLoan(double amount) {
	        if (calculateLoanEligibility()) {
	            System.out.println("Loan of " + amount + " approved for Current Account: " + getHolderName());
	        } else {
	            System.out.println("Loan request denied for Current Account: " + getHolderName());
	        }
	    }
	    public boolean calculateLoanEligibility() {
	        return getBalance() >= 10000;
	    }
	}
	public class Banking_System{
	    public static void main(String[] args) {
	        List<BankAccount> accounts = new ArrayList<>();
	        SavingsAccount sa = new SavingsAccount("S101", "Alice", 8000);
	        CurrentAccount ca = new CurrentAccount("C202", "Bob", 15000);

	        accounts.add(sa);
	        accounts.add(ca);
	        for (BankAccount acc : accounts) {
	            acc.displayDetails();
	            System.out.println("Interest: " + acc.calculateInterest());

	            if (acc instanceof Loanable) {
	                Loanable loanAcc = (Loanable) acc;
	                loanAcc.applyForLoan(5000);
	            }
	            System.out.println("-----------------------");
	        }
	    }
	}