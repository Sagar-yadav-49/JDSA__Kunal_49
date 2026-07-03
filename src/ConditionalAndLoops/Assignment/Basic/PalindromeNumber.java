package ConditionalAndLoops.Assignment.Basic;

public class PalindromeNumber {
    public static boolean isPalindrome(int x){
        int n=x;
        int r=0;
        while(x>0){
            r=x%10;
            x=x/10;
            System.out.println(r);
        }
        return r == n;

    }
    public static void main(String[] args) {
        isPalindrome(121);
    }
}