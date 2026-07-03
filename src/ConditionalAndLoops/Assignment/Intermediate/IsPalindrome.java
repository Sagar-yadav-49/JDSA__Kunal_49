package ConditionalAndLoops.Assignment.Intermediate;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int orgNum =num;
        int rev=0;
        while(num>0){
            // reverse the number
            int r=num%10;
            rev=rev*10+r;
            num/=10;
        }
        if(orgNum ==rev){
            System.out.println("Palindrome Number");
        } else{
            System.out.println("Not a Palindrome Number");
        }

    }
}