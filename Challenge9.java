//WAP to calculate product of two floating poitns numbers

import java.util.Scanner;

public class Challenge9 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the value of x: ");
        float x = input.nextFloat();
        System.out.print("Enter the value of y: ");
        float y = input.nextFloat();
        System.out.print("The Poduct of two float number is: ");
        float product = x*y;
        System.out.println(product);

    }
}
