package ConditionalAndLoops.Assignment.Intermediate;
// Calculate Depreciation of Value
import java.util.Scanner;

public class CalculateDepreciationValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter original value: ");
        double org_value=sc.nextDouble();
        System.out.print("Enter Depreciation rate(in %): ");
        int rate=sc.nextInt();
        if(rate<0 || rate >100){
            System.out.println("Invalid Depreciation Rate...");
            return;
        }
        System.out.print("Enter number of years: ");
        int years=sc.nextInt();
        if(years<0){
            System.out.println("Year cannot be negative");
            return;
        }
        double current_value =org_value;
        for (int i = 0; i < years; i++) {
            current_value = current_value -((rate* current_value)/100);
        }
        System.out.println("New Value after depreciation rate acc to respective years: "+ current_value);
    }
}