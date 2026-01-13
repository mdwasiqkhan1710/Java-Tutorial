void main() {

    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    int guess;
    int attempts = 0;
    int randomNumber = random.nextInt(1, 11);

    IO.println("Welcome to the Guessing Game!");

    do {
        IO.print("Guess any number between 1 to 10: ");
        guess = sc.nextInt();
        attempts++;

        if (guess < randomNumber) {
            IO.println("Number you guessed is too low!!");
        } else if (guess > randomNumber) {
            IO.println("Number you guessed is too high!!");
        } else {
            System.out.printf("You won!! Correct answer is %d.\n", randomNumber);
            System.out.printf("It took you %d attempts.", attempts);
        }
    } while (guess != randomNumber);

    sc.close();

}
