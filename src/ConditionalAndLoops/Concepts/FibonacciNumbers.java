package ConditionalAndLoops.Concepts;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter nth for fibonacci: ");
        int n =sc.nextInt();
        int firstNum=0;
        int secondNum=1;
        int nextNum=0;
        // fibonacci sequence
        for (int i = 1; i <= n; i++) {
            System.out.println(firstNum);
            nextNum=firstNum+secondNum;
            firstNum=secondNum;
            secondNum=nextNum;
        }

        // Nth fibonacci number
        for (int i = 2; i <= n; i++) {
            nextNum=firstNum+secondNum;
            firstNum=secondNum;
            secondNum=nextNum;
        }
        System.out.println(firstNum);

    }
}