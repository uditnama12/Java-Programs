import java.util.Scanner;

public class multiplication_number
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:-");
        int n= sc.nextInt();
        for(int i=1; i<=10; i++)
        {
            System.out.println(n+"*" +i+"="+ n*i);
            sc.close();
        }
    }
}