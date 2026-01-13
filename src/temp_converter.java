import java.util.Scanner;

//Trying to use Ternary Operator

public class temp_converter {
    public static void main(String[] args){

        //Temperature converter program

        Scanner sc = new Scanner(System.in);

        double userTemp;
        double convertedTemp;
        //int option;

        /* System.out.println("Convert your temperature from C to F or vice-versa.");
        System.out.println("Type 1 for converting Celsius to Fahrenheit\nOR Type 2 for converting Fahrenheit to Celsius.\n");

        System.out.print("Select the option (1 or 2): ");
        option = sc.nextInt();

        if(option == 1){
            System.out.print("Enter the temperature value (in degree C): ");
            userTemp = sc.nextDouble();
            convertedTemp = (1.8 * userTemp) + 32;
            System.out.printf("Your converted temperature is %.2f degree F", convertedTemp);
        }
        else if (option == 2) {
            System.out.print("Enter the temperature value (in degree F): ");
            userTemp = sc.nextDouble();
            convertedTemp = (userTemp - 32) * 0.555;
            System.out.printf("Your converted temperature is %.2f degree C", convertedTemp);
        }
        else{
            System.out.println("You haven't selected any valid option! Type either 1 or 2...!!!");
        }

         */

        //Trying to do same thing but this time using Ternary Operator
        System.out.println("Welcome, you can convert temperature from °Celsius to °Fahrenheit OR °Fahrenheit to °Celsius.");

        //User input for temp value
        System.out.print("Enter the temperature you wish to convert: ");
        userTemp = sc.nextDouble();

        //User input for conversion unit
        String unit;
        System.out.print("Enter the unit you wish to convert the temperature to (C or F): ");
        unit = sc.next().toUpperCase();

        //Converting the temperature
        convertedTemp = (unit.equals("C")) ? (userTemp - 32) * 0.555 : (1.8 * userTemp) + 32;

        System.out.printf("Your converted temperature is %.2f °%s", convertedTemp, unit);

        sc.close();
    }
}
