package LambdaExpressions;
import java.util.function.Function;
class Invoice {
    private final String transactionId;
    public Invoice(String transactionId) {
        this.transactionId = transactionId;
        System.out.println("Invoice created for Transaction ID: " + transactionId);
    }

    public String get() {
        return transactionId;
    }
}
public class InvoiceObjectCreation {
    public static void main(String[] args) {
        Function<String, Invoice> invoiceFactory = Invoice::new;
        String id1 = "TXN-2025-001";
        String id2 = "TXN-2025-002";
        System.out.println("--- Creating Invoice 1 ---");
        Invoice invoice1 = invoiceFactory.apply(id1);

        System.out.println("\n--- Creating Invoice 2 ---");
        Invoice invoice2 = invoiceFactory.apply(id2);
        System.out.println("\nVerification:");
        System.out.println("Invoice 1 ID: " + invoice1.get());
        System.out.println("Invoice 2 ID: " + invoice2.get());
    }
}