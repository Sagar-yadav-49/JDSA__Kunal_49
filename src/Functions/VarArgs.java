package Functions;


import java.util.Arrays;

// Variable length of arguments , used when we don't know how many inputs we are giving
public class VarArgs {
    public static void main(String[] args) {
        fun(2,2,3,4,5,66,67); // [2, 2, 3, 4, 5, 66, 67] // print all these and store into an array
        // this syntax telling the compiler that this function can be called via 0 or more than 0 no.
        // of arguments
        fun(); // []

        multiple(4,5,"Sagar","Sonu","Kguygyug");
    }
    static void fun(int ...a){ // this internally will be taking array of integers
        System.out.println(Arrays.toString(a));
    }

    // variable length of args always comes at the end
    static void multiple(int a, int b, String ...v){

    }
}