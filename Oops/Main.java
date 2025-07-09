 package Oops;
 class Car {
    
    String color;
    int speed;
    String carname = "BMW";

     void accelerate(int increase){
        speed = speed + increase;
        System.out.println("Current Speed: " + speed);
    }
    
}// The backticks (`) in the code snippet you provided are not doing anything. They are just used as a formatting convention in some markdown languages to denote inline code or code blocks. In this case, they are not affecting the functionality of the code.


public class Main{
    public static void main(String[] args) {
        
        Car mycar = new Car(); //declaration of object
        mycar.color = "Red"; //
        mycar.speed = 90;
    

        mycar.accelerate(120);

    }
}

