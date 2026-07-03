package First_JavaProgram.Assignment;

// 8. To find out whether the given String is Palindrome or not.
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String org_str=sc.next();
//        String copy_str=org_str;
        String rev="";
        for(int i=org_str.length()-1;i>=0;i--){
            rev +=org_str.charAt(i);
            }
//        System.out.println(rev);
//        System.out.println(org_str);
        if(rev.equals(org_str)){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not Palindrome");
        }
    }

}
