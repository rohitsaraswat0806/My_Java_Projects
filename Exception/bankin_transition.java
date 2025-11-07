package Exception;
import java.util.Random;
class NegativeAmountException extends Exception {
    public NegativeAmountException(String m) { super(m); }
}
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String m) { super(m); }
}
class NetworkFailureException extends Exception {
    public NetworkFailureException(String m) { super(m); }
}
public class bankin_transition {  
	public static void main(String[] args) {
        Random r = new Random();
        double amount = 500.00; 
        System.out.println("--- Starting Transaction Simulation ---");
        try {
            if (amount <= 0) {
                throw new NegativeAmountException("Amount must be positive.");
            }
            int failureType = r.nextInt(3);            
            switch (failureType) {
                case 0:
                    throw new InsufficientFundsException("Balance too low.");
                case 1:
                    throw new NetworkFailureException("Connection lost.");
                case 2:
                    System.out.println("✅ Success: $" + amount + " transferred.");
                    break;
            }
        } catch (NegativeAmountException e) {
            System.err.println("🛑 CAUGHT ERROR: Bad input! " + e.getMessage());

        } catch (InsufficientFundsException e) {
            System.err.println("💸 CAUGHT ERROR: Financial fail! " + e.getMessage());

        } catch (NetworkFailureException e) {
            System.err.println("📡 CAUGHT ERROR: Network fail! " + e.getMessage());
            
        } catch (Exception e) {
            System.err.println("❓ UNEXPECTED ERROR: " + e.getMessage());
        }       
        System.out.println("--- Simulation Ended ---");
    }
}