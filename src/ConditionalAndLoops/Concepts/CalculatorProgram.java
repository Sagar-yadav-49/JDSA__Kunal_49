package ConditionalAndLoops.Concepts;
// Q. Do operations acc to user need, just continue untill user press 'x' or 'X'
import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans=0;
        while (true) {
            System.out.println("Enter a operation: ");
            char ch = sc.next().trim().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/'||ch=='%') {
            System.out.println("Enter 2 numbers: ");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
                if(ch=='+'){
                    ans=num1+num2;
                }
                if(ch=='-'){
                    ans=num1-num2;
                }
                if(ch=='*'){
                    ans=num1*num2;
                }
                if(ch=='/'){
                    if(num2!=0){
                        ans=num1/num2;
                    }
                }
                if(ch=='%'){
                    if(num2!=0){
                        ans=num1%num2;
                    }
                }
            } else if (ch=='x'||ch=='X') {
                break;
            } else {
                System.out.println("Invalid Operation!!");
            }
            System.out.println("Result: "+ans);
        }
    }
}