
import java.util.Scanner;
class LCM {
        public static void main(String []args){
            Scanner input = new Scanner (System.in);
            System.out.println("Welcome to LCM Calculator");
            System.out.print("Please enter first number: ");
            int num = input.nextInt();
            System.out.print("Please enter second number: ");
            int num2 = input.nextInt();
            int lcm = lcm(num,num2);
            System.out.print("LCM of the two numbers is : " +lcm);

        }
        public static int lcm(int num , int num2){
            int i = 1;
            while(i<=num2){
                int factor = num * i;
                if(factor % num2 == 0){
                    return factor;
                }
                i++;
            }
            return 0;
        }
    
}
