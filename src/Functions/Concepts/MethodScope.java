package Functions.Concepts;
// Scope:- where we can access our variables
public class MethodScope {
    // MethodScope:- if you're defining variables inside any function you can only access it inside that particular function
    public static void main(String[] args) {
    int a=10;
    int b=5;


//    System.out.println(num); // can't access num here
    }
    static void random(){
//        System.out.println(a); // can't use variable out of method scope
        int num=67;
        System.out.println(num); // can access num here
    }
}