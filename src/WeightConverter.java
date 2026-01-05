import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args){

        //Weight Converter Program Kilo to Pound & Vice-Versa

        Scanner sc = new Scanner(System.in);

        //Declaring variables
        double weight;
        double convertedWeight;
        int choice;

        //Welcome message
        System.out.println("Welcome, convert your weight from lbs to kgs or vice-versa.");
        System.out.println("Type 1 to convert from lbs to kgs\nOR Type 2 to convert from kgs to lbs");

        //Prompt for user input/choice
        System.out.print("Enter your choice (1 or 2): ");
        choice = sc.nextInt();

        if(choice == 1){ //User entered 1
            System.out.print("Enter your weight (in lbs): ");
            weight = sc.nextDouble();
            convertedWeight = weight * 0.453592;
            System.out.printf("Your weight is %.3f kgs\n", convertedWeight);
        }
        else if(choice == 2){ //User entered 2
            System.out.print("Enter your weight (in kgs): ");
            weight = sc.nextDouble();
            convertedWeight = weight * 2.20462;
            System.out.printf("Your weight is %.3f lbs\n", convertedWeight);
        }
        else{ //User entered another number
            System.out.println("Please select a valid option.");
        }

        System.out.println("Thank you for using our services!");

        sc.close();
    }
}
