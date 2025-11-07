package Exception;
	class InsufficientFundsException extends Exception {  
	    public InsufficientFundsException(String message) {
	        super(message); }}
	class ATM {
	    private int balance;
	    public ATM(int initialBalance) {
	        this.balance = initialBalance;}
	    public void withdraw(int amount) throws InsufficientFundsException {
	        if (amount > balance) {  
	            throw new InsufficientFundsException(
	                "Error: Withdrawal amount (₹" + amount + ") exceeds available balance (₹" + balance + ").");
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawal successful. New balance: ₹" + balance);	        }	    }
	    public int getBalance() {
	        return balance;	    }	}
	public class ATM_System {	    
	    public static void main(String[] args) {	      
	        ATM myATM = new ATM(10000);
	        System.out.println("Initial balance: ₹" + myATM.getBalance());
	        System.out.println("-------------------------------------");	        
	        System.out.println("Attempting to withdraw ₹4000...");
	        try {       
            myATM.withdraw(4000);
	        } catch (InsufficientFundsException e) {	     
	            System.out.println("Transaction failed: " + e.getMessage());	        }
	        System.out.println("-------------------------------------");	     
	        System.out.println("Attempting to withdraw ₹7000...");
	        try {
	            myATM.withdraw(7000);
	        } catch (InsufficientFundsException e) {   
	            System.out.println("Transaction failed: " + e.getMessage());	        }
	        System.out.println("-------------------------------------");
	        System.out.println("Attempting to withdraw ₹2000...");
	        try {
	            myATM.withdraw(2000);
	        } catch (InsufficientFundsException e) {
	            System.out.println("Transaction failed: " + e.getMessage());	        }	        
	        System.out.println("-------------------------------------");
	        System.out.println("Final balance: ₹" + myATM.getBalance());
	    }
	}

