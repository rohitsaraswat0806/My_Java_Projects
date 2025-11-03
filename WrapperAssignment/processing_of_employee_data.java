package WrapperAssignment;
import java.util.*;
public class processing_of_employee_data {
    public static void main(String[] args) {
        int[] ages = {25, 30, 40, 20};
        ArrayList<Integer> list = new ArrayList<>();
        for (int age : ages) list.add(age);
        int youngest = Collections.min(list);
        int oldest = Collections.max(list);
        System.out.println("Youngest: " + youngest);
        System.out.println("Oldest: " + oldest);
    }

}
