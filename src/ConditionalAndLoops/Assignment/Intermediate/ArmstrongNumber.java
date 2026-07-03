package ConditionalAndLoops.Assignment.Intermediate;


import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int orgNum =num;
        int count=0;

        // loop for counting digits, use do while for handling 0

            do {
                num /= 10;
                count++;
            } while (num > 0);

        num= orgNum;
        // processing
        int sum=0;
            do {
                int digit = num % 10;
                sum += (int) Math.pow(digit, count);
                num /= 10;
            } while (num > 0);

        if(orgNum ==sum){
            System.out.println("Armstrong Number");
        } else{
            System.out.println("Not an Armstrong");
        }

    }
}