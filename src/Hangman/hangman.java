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

        String alphabet = "qwertyuiopasdfghjklzxcvbnm";
        var random = new SecureRandom();

        System.out.println("HANGMAN");
        Scanner scanner = new Scanner(System.in);
        int life;
        int j;
        boolean isPlay = true;
        while(isPlay){
            System.out.println("Type \"play\" to play the game, \"exit\" to quit:");
            String play = scanner.nextLine();

            if (play.equals("exit")) {
                isPlay = false;
                break;
            }
            if (play.equals("play")){
                String word = words.get(random.nextInt(words.size()));
                char[] filler = new char[word.length()];
                int i = 0;
                while (i < word.length()) {
                    filler[i] = '-';
                    i++;
                }
                life = 8;

                while (life != 0){

                    System.out.println(filler);
                    System.out.print("Input a letter: > ");
                    String answer = scanner.nextLine();
                    if (answer.length() > 1){
                System.out.println("You should input a single letter.");
                continue;
            }
                    char letter = answer.charAt(0);
                    if(!alphabet.contains(Character.toString(letter))){
                        System.out.println("Please enter a lowercase English letter.");
                        continue;
                    }
                    if (word.contains(letter + "")) {

                        for (j = 0; j < word.length(); j++) {
                            if (filler[j] == letter) {
                                System.out.println("You're already quessed this letter");
                                break;
                            }
                            if (word.charAt(j) == letter) {
                                filler[j] = letter;
                            }
                        }
                    }
                    else {
                        System.out.println("That letter doesn't appear in the word");
                        life--;
                    }

                    if (word.equals(String.valueOf(filler))) {
                        System.out.println("You quessed the word!");
                        System.out.println("You survived!");
                        break;
                    }
                    if(life == 0){
                        System.out.println("You lost!");
                    }
                }
            }
        }
    }
}