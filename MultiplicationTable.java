//WAP to print multiplication table of a number entered by user
import java.util.Scanner;

public class MultiplicationTable {
   public static void main(String[] args) {
    System.out.println("Welcome to multiplication table program ");
    Scanner input =  new Scanner(System.in); 
    System.out.print("Please enter a number: ");
    int num = input .nextInt(); // useer input
    printMultiplicationTable(num);
   }


//function to print multiplication table
   public static void printMultiplicationTable(int num){

    int i=1;
    while(i<=10){
        int multi = num * i;
       // System.out.println(multi);
        System.out.println(num + " X " + i + " = " + multi);
        i++;
    }
   }
    
}
