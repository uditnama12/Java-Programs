import java.util.Scanner;

public class IfElseCondition{
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your age: ");
    int age = input.nextInt();
    if(age>=18){
        System.out.println("You are eligible form driving license");
    } else {
        System.out.println("You are not eligible for driving license");
    }
   } 
}