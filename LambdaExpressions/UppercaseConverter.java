package LambdaExpressions;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class UppercaseConverter {
    public static void main(String[] args) {
        List<String> employeeNames = Arrays.asList(
            "alice smith", 
            "bob johnson", 
            "Charlie brown", 
            "David Lee"
        );

        System.out.println("Original Names: " + employeeNames);
        List<String> uppercaseNames = employeeNames.stream()
            .map(String::toUpperCase) 
            .collect(Collectors.toList());

        System.out.println("---");
        System.out.println("Uppercase Names (for HR Letter):");
        uppercaseNames.forEach(System.out::println);
        System.out.println("---");
        System.out.println("Result " + uppercaseNames);
    }
}
