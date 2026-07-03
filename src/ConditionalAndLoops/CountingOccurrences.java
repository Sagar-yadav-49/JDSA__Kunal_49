package ConditionalAndLoops;
// Q. count the number of occurrences of any particular digit in any given number
// ex:- 12375767 , count for 7 -> 3
import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("Enter of which digit you want number of occurrences: ");
        int digit=sc.nextInt();
        int count=0;
        while (num>0){
            int r=num%10;
            if(r==digit){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}