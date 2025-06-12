//WAP to calcualte Perimeter of a rectangle
import java.util.Scanner;
public class Challenge10 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Lenght of the rectangle: ");
        int l = input.nextInt();
        System.out.print("Enter the Breadth of the rectangle: ");
        int b = input.nextInt();
        int perimeter = 2 * (l + b);
        System.out.print("The Perimeter of the rectangle is: " + perimeter);

    }

    
}
