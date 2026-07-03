package First_JavaProgram.Assignment;
// 2. Take name as input and print a greeting message for that particular name.
import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter name: ");
        String name=sc.nextLine();
        if(name.equals("Sagar")){
            System.out.println("Hello "+name);
        }
    }
}