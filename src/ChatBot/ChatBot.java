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
        System.out.println("Now I will prove to you that i can count to any number you want");
        int number = scanner.nextInt();
        for (int num_1 = 1; num_1 < number + 1; num_1++){
            System.out.println("" + num_1 + " !");
        }
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        int answer = 0;
        while (answer != 2){
            answer = scanner.nextInt();
            if (answer != 2){
                System.out.println("Please, try again.");
            }
            if (answer == 2){
                System.out.println("Great, you right!");
            }
        }
        System.out.println("Goodbye, have a nice day!");
    }
}
