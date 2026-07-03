package Functions.Concepts;
public class IntegerParameter {
    public static void main(String[] args) {
        int sum=sum(5,10);
        System.out.println(sum);
    }
    static int sum(int a, int b){
        int sum=a+b;
        return sum;
    }
}