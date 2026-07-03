package ConditionalAndLoops.Assignment.Intermediate;

import java.util.Scanner;

// Calculate Discount Of Product
public class CalculateDiscount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter price of product: ");
        double price=sc.nextDouble();
        double discount=0;
        if(price<0){
            System.out.println("Invalid price");
            return;
        } else if(price>=0 && price<1000){
            System.out.println("No Discount Available, Shop more !!");
        } else if(price>=1000 && price<10000){
            discount=price*0.05;
            price-=discount;
        } else if (price>=10000 && price<50000) {
            discount=price*0.10;
            price=price-discount;
        } else if (price>=50000 && price<100000) {
            discount = price * 0.15;
            price=price-discount;
        } else{
            discount=price*0.20;
            price=price-discount;
        }
        System.out.println("Price of product after discount is: "+price);
    }
}