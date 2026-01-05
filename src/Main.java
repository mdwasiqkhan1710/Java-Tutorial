import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double height = 0;
        double width = 0;
        double area = 0;

        System.out.println("Calculate the area of your Rectangle.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height: ");
        height = scanner.nextDouble();

        System.out.print("Enter width: ");
        width = scanner.nextDouble();

        area = height * width;
        System.out.println("Area of your rectangle is: " + area + " square meter.");
        scanner.close();
    }
}
