import java.util.Scanner;

class main {

    public static void main(String[] args) {
        {
            int maxLimit = 100;
            int minLimit = 0;
            int maxAttempts = 6;
            int secret_number = (int) (Math.random() * (maxLimit - minLimit + 1));
            int userGuessNumber = 0;

            System.out.println(
                    "You are playing a game: Guess the Number. \nYou have a maximum of " + maxAttempts
                            + " attempts to guess the number. \n ");

            for (int attempt = 0; attempt < maxAttempts; attempt++) {
                userGuessNumber = takeInput(minLimit, maxLimit, userGuessNumber);
                String guessesLeft = "You have " + (maxAttempts - attempt - 1) + " attempts remaining.";

                if (userGuessNumber < secret_number) {
                    System.out.println("You guessed too small.\n" + guessesLeft);
                } else if (userGuessNumber > secret_number) {
                    System.out.println("You guessed too high.\n" + guessesLeft);
                } else {
                    System.out.println("That it! You got it!");
                    return;
                }
            }
            System.out.println("The number was " + secret_number + ".\n");

        }
    }

    public static int takeInput(int minLimit, int maxLimit, int guess) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a number between " + minLimit + " and " + maxLimit + ".\n");
        if (userInput.hasNextInt()) {
            guess = userInput.nextInt();
        } else {
            System.out.println("Please enter a number between " + minLimit + " and " + maxLimit + ".\n");
        }
        return guess;
    }
}