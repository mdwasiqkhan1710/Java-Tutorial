//Creating a MadLibs Game.

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String noun1;
        String adjective1;
        String verb;
        String noun2;
        String adjective2;

        System.out.print("Enter a noun: ");
        noun1 = sc.nextLine();

        System.out.print("Enter an adjective: ");
        adjective1 = sc.nextLine();

        System.out.print("Enter a verb: ");
        verb = sc.nextLine();

        System.out.print("Enter another noun: ");
        noun2 = sc.nextLine();

        System.out.print("Enter another adjective: ");
        adjective2 = sc.nextLine();

        System.out.println("My name is " + noun1 + " and I went to School.");
        System.out.println("I am very " + adjective1 + " in my class.");
        System.out.println("I can " + verb + " as fast as possible.");
        System.out.println("My friend is " + noun2 + " who is just like me in the class.");
        System.out.println("He is also the biggest " + adjective2 + " in his family.");

        sc.close();
    }
}
