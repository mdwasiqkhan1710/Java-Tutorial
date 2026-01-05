//Creating a Shopping cart to understand basic Input-Output

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args){

        System.out.println("Calculate the total price of your shopping cart.");

        Scanner sc = new Scanner(System.in);

        String item; //taking the item name as input & storing in the variable
        double price; //taking the item price as input & storing in the variable
        int quantity; //taking the item quantity as input & storing in the variable
        char currency = '$'; //initialized the currency symbol


        System.out.print("Enter the name of the item: ");
        item = sc.nextLine();
        System.out.print("Enter the price of the item: ");
        price = sc.nextDouble();
        System.out.print("Enter the quantity of the item: ");
        quantity = sc.nextInt();

        double total = price * quantity; //Calculated the total price and stored in a new variable
        System.out.println("You purchased " + item + " and your total payable amount is🤑💵: " + currency + total);

        sc.close();
    }
}
