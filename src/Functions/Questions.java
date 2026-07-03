package Functions;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(isPrime(n));
//        System.out.println(isArmstrong(153));

        // print all 3 digits armstrong number
        for (int i = 1000; i < 10000; i++) {
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
//    static boolean isPrime(int n){
//        if(n<=1){
//            return false;
//        }
//        int c=2;
//        while(c*c<=n){
//            if(n%c==0){
//                return false;
//            }
//            c++;
//        }
//        return c*c>n;
//    }

    static boolean isArmstrong(int n){

        int copy_num=n;
        int count=0;
        if(n==0){
            count=1;
        }
        while(n>0){
            int r=n%10;
            count ++;
            n/=10;
        }
        n=copy_num;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum+=(int)Math.pow(r,count);
            n/=10;
        }
        return sum==copy_num;
    }
}