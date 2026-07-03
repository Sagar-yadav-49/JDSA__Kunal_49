package First_JavaProgram;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Number is: "+num);
        System.out.println(sc.next());

    }
}