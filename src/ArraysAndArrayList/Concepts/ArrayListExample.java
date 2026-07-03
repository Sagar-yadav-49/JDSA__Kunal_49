package ArraysAndArrayList.Concepts;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(23);
        list.add(1212);
        list.add(2122);
        list.add(24);
        list.add(55);
        list.add(545);
        list.add(4545);
        list.add(32);
        list.add(455445);
        list.add(34);
        // more than 10
        list.add(566);
        list.add(1213);
        list.add(325);
        list.add(554);
        list.add(767);
        // we can directly print list, bcoz, internally it is calling toString() method
        System.out.println(list); // [23, 1212, 2122, 24, 55, 545, 4545, 32, 455445, 34, 566, 1213, 325, 554, 767]
        System.out.println(list.contains(325)); // true
        System.out.println(list.contains(2323)); // false

        list.set(0,99);
        System.out.println(list); // [99, 1212, 2122, 24, 55, 545, 4545, 32, 455445, 34, 566, 1213, 325, 554, 767]

        list.remove(1);
        System.out.println(list); // [99, 2122, 24, 55, 545, 4545, 32, 455445, 34, 566, 1213, 325, 554, 767]

        // input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here

        }
    }
}