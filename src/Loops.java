import java.util.Scanner;

public class Loops {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int rows, cols;
        char symbol;

        System.out.println("Print your favourite symbol in a matrix!");

        System.out.print("Enter the number of rows you want: ");
        rows = sc.nextInt();
        System.out.print("Enter the number of columns you want: ");
        cols = sc.nextInt();

        System.out.print("Enter the symbol you want to print: ");
        symbol = sc.next().charAt(0);

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        sc.close();
    }
}
