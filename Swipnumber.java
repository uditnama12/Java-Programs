import java.util.Scanner;

public class Swipnumber{
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);

        System.out.print(" Enter the value of A : ");
        int a = input.nextInt();

        System.out.print(" Enter the value of B: ");
        int b = input.nextInt();

        int c=a;
            a=b;
            b=c;

            System.out.println("After Swapping the values we get: ");
        System.out.print("Value of A is: ");
        System.out.println(a);

        System.out.print("Value of B is: ");
        System.out.println(b);
    }
}