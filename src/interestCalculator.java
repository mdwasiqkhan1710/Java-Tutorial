import java.util.Scanner;

public class interestCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double P; //Principal
        double T; //Time
        double R; //Rate of Interest

        System.out.print("Enter P: ");
        P = sc.nextDouble();
        System.out.print("Enter R: ");
        R = sc.nextDouble();
        System.out.print("Enter T: ");
        T = sc.nextDouble();

        double val = (100+R)/100;

        double Amount = P * Math.pow(val, T);

        System.out.printf("Your amount is: Rs.%.3f", Amount);

        sc.close();
    }
}
