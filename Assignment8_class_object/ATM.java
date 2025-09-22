package Assignment8_class_object;
	import java.util.Scanner;
	public class ATM {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter Account Holder Name: ");
		        String accountHolder = scanner.nextLine();
		        System.out.print("Enter Account Number: ");
		        String accountNumber = scanner.nextLine();
		        System.out.print("Enter Initial Balance: ");
		        double initialBalance = scanner.nextDouble();
		        scanner.nextLine(); 

		        BankAccount account = new BankAccount(accountHolder, accountNumber, initialBalance);

		        int choice;
		        do {
		            System.out.println("\n--- Home Menu ---");
		            System.out.println("1. Deposit");
		            System.out.println("2. Withdraw");
		            System.out.println("3. Display Balance");
		            System.out.println("4. Exit");
		            System.out.print("Enter your choice: ");
		            choice = scanner.nextInt();
		            scanner.nextLine(); 

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter amount to deposit: ");
		                    double depositAmount = scanner.nextDouble();
		                    account.deposit(depositAmount);
		                    break;
		                case 2:
		                    System.out.print("Enter amount to withdraw: ");
		                    double withdrawAmount = scanner.nextDouble();
		                    account.withdraw(withdrawAmount);
		                    break;
		                case 3:
		                    account.displayBalance();
		                    break;
		                case 4:
		                    System.out.println("Thank you for using the App. Goodbye!");
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please try again.");
		            }
		        } while (choice != 4);

		        scanner.close();
		    }
		}

		class BankAccount {
		    private String accountHolder;
		    private String accountNumber;
		    private double balance;

		    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
		        this.accountHolder = accountHolder;
		        this.accountNumber = accountNumber;
		        this.balance = initialBalance;
		        System.out.println("Account created successfully for " + accountHolder + " (Account No: " + accountNumber + ")");
		    }

		    public void deposit(double amount) {
		        if (amount > 0) {
		            balance += amount;
		            System.out.println("Successfully deposited: $" + String.format("%.2f", amount));
		        } else {
		            System.out.println("Deposit amount must be positive.");
		        }
		    }

		    public void withdraw(double amount) {
		        if (amount > 0) {
		            if (balance >= amount) {
		                balance -= amount;
		                System.out.println("Successfully withdrew: $" + String.format("%.2f", amount));
		            } else {
		                System.out.println("Insufficient balance for withdrawal.");
		            }
		        } else {
		            System.out.println("Withdrawal amount must be positive.");
		        }
		    }

		    public void displayBalance() {
		        System.out.println("Account Holder: " + accountHolder);
		        System.out.println("Account Number: " + accountNumber);
		        System.out.println("Current Balance: $" + String.format("%.2f", balance));
		    }
		}

