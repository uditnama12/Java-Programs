import java.util.Scanner;

import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

public class ReverseTheDigits {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to Reverse The Digits Calculator");
        System.out.print("Please Enter the Number: ");
        int num = input.nextInt();
        int rev = reverse(num);
        System.out.print("The Reverse of the Number is: " + rev);
}
    public static int reverse(int num) {
        int x = 0;
        while(num>0) {
            int digit = num % 10;
            x = x*10 + digit;
            num = num/10;

        }
        return x;
    }

}