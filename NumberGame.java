package InternshipCodsoftTask;

import java.util.Scanner;

class GuessTheNumber {
    static int totalRoundplayed = 0;
    static int wonRoundplayed = 0;

    public static int genarateTheRandomNumber() {
        int randomNumber = 1 + (int) (Math.random() * 100);
        return randomNumber;
    }

    public static void checkTheGuessNumber() {
        System.out.println("You have only 5 attempts in a round.");
        System.out.println("You can guess numbers between 1 to 100.");
        totalRoundplayed++;
        Scanner scan = new Scanner(System.in);
        int randomNumber = genarateTheRandomNumber();
        int totalAttempt = 5;
        int i = 1;
        int countAttempt = 0;
        System.out.print("Enter guess number: ");
        while (i <= totalAttempt) {
            int guessNumber = scan.nextInt();
            countAttempt++;
            if (guessNumber == randomNumber) {
                wonRoundplayed++;
                System.out.println("Correct guessed number.");
                System.out.println("You won the game in " + countAttempt + " attempts.");
                break;
            }
            if (i < totalAttempt) {
                if (guessNumber > randomNumber) {
                    System.out.print("Too high, ");
                } else {
                    System.out.print("Too low, ");
                }
                System.out.print("Enter again guess number: ");
            }
            i++;

        }
        if (i > totalAttempt) {
            System.out.println("Incorrect guessed number");
            System.out.println("Attempts Completed and you lose the game.");
        }
        System.out.println("Choose Option");
        System.out.println("1. Play Again");
        System.out.println("2. Exit");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                checkTheGuessNumber();
            case 2:
                System.out.println("Total rounds you played  = " + totalRoundplayed);
                System.out.println("Total rounds you won = " + wonRoundplayed);
                System.out.println("Total rounds you lost = " + (totalRoundplayed - wonRoundplayed));
                System.out.println("You total score is : " + (wonRoundplayed * countAttempt * 10));
                System.exit(0);
        }
    }
}

public class NumberGame {
    public static void main(String[] args) {
        GuessTheNumber guessnum = new GuessTheNumber();
        guessnum.checkTheGuessNumber();

    }
}