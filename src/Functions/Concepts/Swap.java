package Functions.Concepts;
public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        swap(a,b);
//        System.out.println(a+" "+b); // 10 5
    }
    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        // this change will only be valid in this function scope only
        System.out.println(a+" "+b); // 5 10
    }
}