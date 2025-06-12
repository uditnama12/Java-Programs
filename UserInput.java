import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your name: ");
        String name = input.nextLine();
        System.out.println(" Good morning " + name);
        System.out.print(name + " Also tell me your age: ");
        int age = input.nextInt();
        System.out.println(" Your age is:" + age);

        System.out.println("Please Enter you salary: ");
        int a = input.nextInt();
       // System.out.println(" Please enter your salary: " + a);
       
       System.out.println(" Please enter your PF Amunt: ");
        int b = input.nextInt();
        
        int c = a-b;
        System.out.println("Your actual salary is : " + c);

        System.out.println(" Please enter your ESIC amount : ");
        int E = input.nextInt();

        int Total = c + E;
        System.out.println("Your total Inhand Salary is : " + Total);
        

    }
}
