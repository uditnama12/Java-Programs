import java.util.Scanner;



public class FibonacciSeries {
      public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcomr to fibonacci Series");
        System.out.print("Please enter the number up to which you want the series: ");
        int num = input.nextInt();
        System.out.println("Here is the Fibonacci series: ");
        fibonacci(num);
    }
     
    public static void fibonacci(int num){
        if(num < 0) return;
        System.out.print("0 ");
        if(num ==0) return;
    System.out.print("1 ");

    int First =0, Second=1;
    while(First + Second <=num ){
        int third = First + Second;
        System.out.print(third + " ");
       //Swapping the values
        First = Second;
        Second = third;

    }
    }
}                                      