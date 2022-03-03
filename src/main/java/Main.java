import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    public static void main(String[] args) {

        int random = (int) (Math.random() * (100 - 1) + 1);
        Scanner scanner = new Scanner(System.in);
        Integer userInput = 0;
        int attempts = 0,
                memory = 0;
        Main.println("Enter a number between 1 and 100.");
        while (userInput != random) {
            userInput = scanner.nextInt();
            if (userInput == memory) {
                System.out.println("You already said that. Try again");
            } else if (userInput > random) {
                System.out.println("Too large.");
                attempts += 1;
                memory = userInput;
            } else if (userInput < random) {
                System.out.println("Too small.");
                attempts += 1;
                memory = userInput;
            } else if (userInput == random) {
                System.out.println("Correct guess.");
                attempts += 1;
                memory = userInput;
            }
        }
        System.out.print("Total attempts: " + attempts);
    }

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

}

