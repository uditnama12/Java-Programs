public class Parameter {

    public static int add(int a, int b){   //when we pass define the defination , then it is call parameter
       int sum = a+b;
        return sum;

    }
    
    public static void main(String[] args) {
         int num = add(8,10);  //when we pass actual value, then it is call argument
         System.out.println("Sum of two numbers is: " + num);
        System.out.println(add(50,90));
        System.out.println(add(100,200));
        System.out.println(add(-1000,2000));
    }

    
}
 