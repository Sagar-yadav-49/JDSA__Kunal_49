package ConditionalAndLoops;
// Q. Largest of numbers
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        // Method 1
//        if(a>b && a>c){
//            System.out.println("Largest: "+a);
//        } else if(b>c){
//            System.out.println("Largest: "+b);
//        } else{
//            System.out.println("Largest: "+c);
//        }

        // Method 2
        // assume one input as maximum and then compare others with it
//        int max=a;
//        if(b>max){
//            max=b;
//        }
//        if(c>max){
//            max=c;
//        }
//        System.out.println(max);


        // Method 3
//        int max=0;
//        if(a>max){
//            max=a;
//        } else if (b>max) {
//            max=b;
//        }
//        if(c>max){
//            max=c;
//        }

        // Method 4
        // using Math.max() method
//        int max=Math.max(a,b);
//        if(c>max){
//            max=c;
//        }

        // Method 5
        int max=Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}