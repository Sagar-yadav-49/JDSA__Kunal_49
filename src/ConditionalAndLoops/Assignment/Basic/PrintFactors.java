package ConditionalAndLoops.Assignment.Basic;
// 23. Input a number and print all the factors of that number (use loops).
import java.util.Scanner;

public class PrintFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        // print factor pairs
        for (int i= 1; i <=num; i++) {
            for(int j=1;j<=num;j++){
                if(i*j==num){
                    System.out.println(i+"X"+j);
                }
            }
        }
        // print factors
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
