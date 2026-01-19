//Java Quiz Game

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //Questions of the Quiz
        String[] questions = {"What is the main function of the router?",
                                "Which part of the computer is known as its brain?",
                                "What year Facebook was launched?",
                                "Who is known as the father of the computer?",
                                "What was the first Programming Language?"};

        //Options for each question
        String[][] options = {{"1. Storing files","2. Encrypting Data","3. Directing internet traffic","4. Managing passwords"},
                              {"1. CPU","2. Hard Drive","3. RAM","4. GPU"},
                              {"1. 2000","2. 2004","3. 2006","4. 2008"},
                              {"1. Steve Jobs","2. Bill Gates","3. Alan Turning","4. Charles Babbage"},
                              {"1. COBOL","2. C","3. Fortran","4. Java"}};

        //Declaring the variables
        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        System.out.println("*********************************************************");
        System.out.println("Welcome to the Java Quiz Game...."); //Displaying welcome message
        System.out.println("*********************************************************\n");

        for(int i=0; i<questions.length; i++){ //Displaying each question
            System.out.println(questions[i]);

            for(String option : options[i]){ //Displaying options for each question
                System.out.println(option);
            }

            System.out.print("Enter your guess(1/2/3/4): ");
            guess = sc.nextInt();

            if(guess == answers[i]){
                System.out.println("\n**************************");
                System.out.println("Correct!!");
                System.out.println("**************************\n");
                score++;
            }else{
                System.out.println("\n**************************");
                System.out.println("Wrong!!");
                System.out.println("**************************\n");
            }
        }

        //Displaying final score
        System.out.println("Your final score is: " + score + " out of " + questions.length);

        sc.close();
    }
}
