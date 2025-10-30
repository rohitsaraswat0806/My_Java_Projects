package LambdaExpressions;
import java.util.Arrays;
import java.util.List;
public class HospitalPatient_IDPrinting {
    public static void main(String[] args) {
        List<String> patientIDs = Arrays.asList(
            "P1001", 
            "P1002", 
            "P1003", 
            "P1004", 
            "P1005"
        );
        System.out.println("--- Printing All Patient IDs for Admin Verification ---");
        patientIDs.forEach(System.out::println);
    }
}


