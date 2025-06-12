//Area of triangle
import java.util.Scanner;
public class Challenge11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int h = input.nextInt();
        System.out.print("Enter the base of the triangle: ");
        int b = input.nextInt();
        double area= 0.5 *h*b;

        System.out.print("The area of the triangle is: ");
        System.out.println(area);

}   
}
