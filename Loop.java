import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int i = 0;
        while (i<=10){
            System.out.println(i);
            i++;
        }

        int count = 500;
        while(count>=200){
            System.out.println(count);
            count--;
        } 

        Scanner input = new Scanner(System.in);
        int s = 0;
        while (s<5){
             int inp = input.nextInt();
             System.out.println("Number is: " + inp);
            i= i+1;
        }
    }
    
}
 