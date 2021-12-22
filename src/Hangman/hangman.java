package Hangman;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        System.out.println("""
                HANGMAN
                Guess the word: >""");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if (name.equals("java")){
            System.out.println("You win!");
        }
        else {
            System.out.println("You lost!");
        }
    }
}
