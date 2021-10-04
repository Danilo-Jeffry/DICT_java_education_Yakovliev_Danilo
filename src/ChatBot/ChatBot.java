package ChatBot;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args){
        System.out.println("Hello! My name is Jordan");
        System.out.println("I was created in 2021.");
        System.out.println("Please, remind me your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int age3 = scanner.nextInt();
        int age5 = scanner.nextInt();
        int age7 = scanner.nextInt();
        int age = (age3 * 70 + age5 * 21 + age7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }
}
