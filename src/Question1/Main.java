package Question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            CircleWithException circle = new CircleWithException();
            System.out.println("Enter the radius of the circle");
            double radius = in.nextDouble();

            circle.setRadius(radius);

            System.out.printf("The area of circle : %s%n", circle.getArea());

            System.out.printf("The diameter of circle : %s%n", circle.getDiameter());

        }catch(Exception e){
            System.out.printf(e + " : Invalid Radius value (Either area have exceeded 1000 or radius less than 0)");
        }

    }
}
