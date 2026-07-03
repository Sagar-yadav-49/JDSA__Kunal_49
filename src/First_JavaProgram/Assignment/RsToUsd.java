package First_JavaProgram.Assignment;
// 6. Input currency in rupees and output in USD.
import java.util.Scanner;

public class RsToUsd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter currency in rs: ");
        float rs=sc.nextFloat();
        double usd=rs*94.70;
        System.out.println("Equivalent USD is: "+usd);

    }
}