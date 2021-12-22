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
        var random = new SecureRandom();
        String word = words.get(random.nextInt(words.size()));
        char[] filler = new char[word.length()];
        int i = 0;
        while (i < word.length()) {
            filler[i] = '-';
            i++;
        }


        System.out.println("HANGMAN");
        Scanner scanner = new Scanner(System.in);
        int life = 8;
        int j;
        while (life != 0) {
            System.out.println(filler);
            System.out.print("Input a letter: > ");
            char letter = scanner.nextLine().charAt(0);
            if (word.contains(letter + "")) {
                for (j = 0; j < word.length(); j++) {
                    if (filler[j] == letter) {
                        System.out.println("No improvements");
                        life--;
                    }
                    if (word.charAt(j) == letter) {
                        filler[j] = letter;
                    }
                }
            } else {
                System.out.println("That letter doesn't appear in the word");
                life--;
            }
            if (word.equals(String.valueOf(filler))) {
                System.out.println("You quessed the word!");
                System.out.println("You survived!");
                life = 0;
            }
        }
    }
}