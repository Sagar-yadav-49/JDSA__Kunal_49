package Functions;

public class PalindromeNumber {
    public static void main(String[] args) {
        isPalindrome(10);

    }
    public static boolean isPalindrome(int x){
            int num=x;
            int rev=0;
            while(x>0){
                int r=x%10;
                x=x/10;
                rev=rev*10+r;
            }
            return num==rev;
        }
}