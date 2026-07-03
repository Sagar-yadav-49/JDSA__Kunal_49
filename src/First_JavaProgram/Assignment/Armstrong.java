package First_JavaProgram.Assignment;
// 9. To find Armstrong Number between two given number.
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        // display the number digits
//        int num=153;
//        int org_num=num;
//        int r=0;
//        int count=0;
//        while(num>0){
//            r=num%10;
//            num=num/10;
//            System.out.println(r);
//            // counting the digits
//            count++;
//        }
//        System.out.println();
//        System.out.println("Number of digits are: "+count);
//        System.out.println(num); // 0, num now becomes 0 so store it in another variable for further processing
//        System.out.println(org_num); // 153

        // Armstrong Number
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int org_num=num;
        int sum=0;
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        num=org_num;
        if(num==0){
            count=1;
        }
        System.out.println("Count: "+count);
        while(num>0){
            int r=num%10;
            sum+=(int)Math.pow(r,count);
            num=num/10;

        }
        System.out.println(sum);
        if(org_num==sum){
            System.out.println("Armstrong number");
        } else{
            System.out.println("Not a Armstrong number");
        }

    }
}