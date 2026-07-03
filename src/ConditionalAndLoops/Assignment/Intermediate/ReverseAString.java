package ConditionalAndLoops.Assignment.Intermediate;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        String rev="";
        for (int i = str.length()-1; i >= 0; i--) {
            rev+=str.charAt(i);
        }
        System.out.println(rev);
    }
}