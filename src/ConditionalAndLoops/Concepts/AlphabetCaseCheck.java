package ConditionalAndLoops.Concepts;
// Q. Take character as input and check its case (uppercase or lowercase)
import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().trim().charAt(0);
        System.out.println(ch);

        // Method 1
//        int ascii=ch;
//        if(ascii>=65 && ascii <=90)
//        {
//            System.out.println("UpperCase");
//        } else if (ascii >=97 && ascii <=122) {
//            System.out.println("LowerCase");
//        }

        // Method 2
        // we need not to converts into integer for ASCII value
        // bcoz, it will work already on integer while checking inside conditionals
        if(ch>='a'&&ch<='z'){
            System.out.println("LowerCase");
        } else{
            System.out.println("UpperCase");
        }
    }
}