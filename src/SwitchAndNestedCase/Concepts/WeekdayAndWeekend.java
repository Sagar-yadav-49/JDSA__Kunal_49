package SwitchAndNestedCase.Concepts;

import java.util.Scanner;

public class WeekdayAndWeekend {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a day number: ");
        int day=sc.nextInt();
        // old style
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//            default:
//                System.out.println("Invalid day");
//        }
        // Enhanced Style :- much cleaner and prettier
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid day");
        }
    }
}