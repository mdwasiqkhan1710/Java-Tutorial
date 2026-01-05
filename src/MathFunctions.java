// import java.util.Objects;
import java.util.Scanner;

public class MathFunctions {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        /*function for calculating the value of hypotenuse of triangle
        System.out.println("Calculate the value of hypo of your triangle!");
        double base;
        double height;
        double hypo;

        System.out.print("Base of triangle = ");
        base = sc.nextDouble();

        System.out.print("Height of triangle = ");
        height = sc.nextDouble();

        hypo = Math.sqrt((base*base) + (height*height));
        System.out.println("Hypo of your triangle = " + hypo); */

        //Functions for calculating circumference and area of circle and the volume of radius formed by that circle
        String value;
        System.out.print("What do you wish to calculate? (Circumference/Area/Volume): ");
        value = sc.nextLine();

        double radius;
        System.out.print("Enter the radius of the sphere: ");
        radius = sc.nextDouble();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        double volume = 4.0/3.0 * Math.PI * Math.pow(radius, 3);

        if(value.equals("Circumference") || value.equals("circumference")){
            System.out.printf("Circumference of circle = %.2f cm squared", circumference);
        } else if (value.equals("Area") || value.equals("area")) {
            System.out.printf("Area of circle = %.2f cm squared", area);
        } else if (value.equals("Volume") || value.equals("volume")) {
            System.out.printf("Volume of sphere = %.2f cm cubed", volume);
        }else{
            System.out.println("You haven't selected correct option!");
        }
        System.out.println();

        sc.close();
    }
}
