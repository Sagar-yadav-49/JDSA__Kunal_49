package ConditionalAndLoops.Assignment.Intermediate;

import java.util.Scanner;

public class FindNcrAndNpr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total number of objects: ");
        int n=sc.nextInt();
        System.out.print("Enter number of objects you wanna select/arrange: ");
        int r= sc.nextInt();
        if(r>n || n<0 || r<0){
            System.out.println("Invalid Input");
            return;
        }
        // find factorial of n
        int factN=1;
        for (int i = 1; i <=n ; i++) {
            factN*=i;
        }

        int factR =1;
        for (int i = 1; i <=r ; i++) {
            factR *=i;
        }

        int diff=n-r;
        int factD =1;
        for (int i = 1; i <=diff ; i++) {
            factD *=i;
        }

        int Ncr=factN/(factR*factD);
        int Npr=factN/factD;
        System.out.println("Combination Ncr: "+Ncr);
        System.out.println("Permutation Npr: "+Npr);
    }
}