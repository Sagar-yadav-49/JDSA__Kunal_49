package First_JavaProgram.Assignment;
// 1. Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Given number is even");
        } else{
            System.out.println("Given number is odd");
        }

    }
}