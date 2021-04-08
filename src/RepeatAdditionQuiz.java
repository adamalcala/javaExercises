import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 10);
        int number = (int)(Math.random() * 10);

        // Create Scanner
        Scanner input = new Scanner(System.in);

        System.out.print(
            "What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        while (number1 + number2 != answer) {
            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
        }

        System.out.println("You got it!");
    }
}