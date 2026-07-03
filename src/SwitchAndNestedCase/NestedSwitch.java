package SwitchAndNestedCase;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter emp id and department name: ");
        int empID=sc.nextInt();
        String dept=sc.next();
        // old style
//        switch (empID){
//            case 1:
//                System.out.println("Shubham Sharma");
//                break;
//            case 2:
//                System.out.println("Nikhil");
//                break;
//            case 3:
//                System.out.println("Emp id 3");
//                switch (dept){
//                    case "IT":
//                        System.out.println("IT department");
//                        break;
//                    case "CSE":
//                        System.out.println("Cse department");
//                        break;
//                    default:
//                        System.out.println("No department entered");
//                }
//                break;
//            default:
//                System.out.println("Invalid emp ID");
//        }


        // enhanced style
        switch (empID) {
            case 1 -> System.out.println("Shubham Sharma");
            case 2 -> System.out.println("Nikhil");
            case 3 -> {
                System.out.println("Emp id 3");
                switch (dept) {
                    case "IT" -> System.out.println("IT department");
                    case "CSE" -> System.out.println("Cse department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Invalid emp ID");
        }
    }
}