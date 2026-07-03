package Functions;

public class BlockScope {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        // Block Scope
        {
//            int a=5; // can't do this, already initialized outside the block in the same method, hence you cannot initialize it again
            a=9; // but you can definitely change the value , reassigning the original ref variable to some other value
            System.out.println(a); // 9
            int c=99;
            // values initialized inside the block , only remain within the block
        }
        System.out.println(a); // 9
//        System.out.println(c); // can't use outside the block
    }
}