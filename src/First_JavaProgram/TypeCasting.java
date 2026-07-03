package First_JavaProgram;

public class TypeCasting {
    public static void main(String[] args) {
        // automatically type conversion conditions:-
        // 1. the two types should be compatible
        // 2. destination type should be greater than the source type


        // type casting(narrowing conversion/explicitly) :- if we have to do it anyway (which is not done automatically)
        // :- compressing the bigger number into smaller type explicitly
//        int num = (int) 67.38f;
//        System.out.println(num); // 67

        // automatically type promotion in expression
        // byte can store maximum value upto 256, so even if we type casting int into byte, it's not showing correct result
//        int a = 257;
//        byte b = (byte) a; // 257 % 256 =1
//        System.out.println(b);

        // even if byte can store upto 256 and after multiplying two bytes x and y it becomes 2000
        // so intermediate result of byte exceed its limit i.e 256
        // so it automatically do type promotion of data types like:- byte,short into int
        // in case of expressions
//        byte x = 50;
//        byte y = 40;
//        byte c = 100;
//        int z = (x * y) / c;
//        System.out.println(z); // 20

        // when we are doing expression (w*2) it automatically becomes integer , so how can we store it into byte (w)
        // we can't do it without explicitly type casting
//        byte w =50;
//        w=w*2;

        // Java follows Unicode(it can work with all universal language)
//        System.out.println("नमस्ते");
//        System.out.println("你好");


        // ASCII value
        // it automatically type promotion of char into int, based on their ASCII value
//        int number='a';
//        System.out.println(number); // 97


        // Rules for Type Promotion
        // 1. all the byte, short , char value are promoted to integer
        // 2. if any of the operand is float, double, long then whole operation is promoted to respectively float, double, long

//        System.out.println(5*22.22f); // 111.1


        // Example for Revision
        byte b=100;
        short s=12;
        char c='a';
        int i=5000;
        float f=24.25f;
        double d=3892.8923;
        double result=(f*i)+(b-s)+(d*c);
        // float, byte, double = double(result will be in double , since, maximum is double)
        System.out.println((f*i)+"   "+(b-s)+"   "+(d*c));
        System.out.println(result); // 498948.5531

    }
}