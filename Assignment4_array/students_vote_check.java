//VOTE ELIGIBLE CHECK

package Assignment4_array;
import java.util.Scanner;

public class students_vote_check {
    public static void main(String[] abcd) {
        Scanner sc = new Scanner(System.in);

        int studages[] = new int[10]; 
       
        for(int i=0; i<10; i++){
            System.out.print("Enter age of student " + (i+1) + ": ");
            studages[i] = sc.nextInt();
        }

    
        for(int i=0; i<10; i++){
            if(studages[i] < 0){
                System.out.println("Invalid age");
            }
            else if(studages[i] >= 18){
                System.out.println("The student with the age " + studages[i] + " can vote.");
            }
            else{
                System.out.println("The student with the age " + studages[i] + " cannot vote.");
            }
        }
    }
}

