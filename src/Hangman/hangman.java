package Hangman;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class hangman {


    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("java");
        words.add("kotlin");
        words.add("javascript");
        words.add("python");
        String quess = "";
        var random = new SecureRandom();
        String word = words.get(random.nextInt(words.size()));
        if (word.equals("java")){
            quess = "ja--";
        }
        if (word.equals("kotlin")){
            quess = "ko----";
        }
        if (word.equals("javascript")){
            quess = "ja--------";
        }
        if (word.equals("python")){
            quess = "py----";
        }

        System.out.println("HANGMAN");
        System.out.println("Guess the word " + quess + ": >");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if (name.equals(word)){
            System.out.println("You win!");
        }
        else {
            System.out.println("You lost!");
        }
    }
}
