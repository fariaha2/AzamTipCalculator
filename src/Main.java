import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Welcome to the tip calculator!");
            System.out.println("How many people are in your group?");
            int numOfPeople = scan.nextInt();
            System.out.println("What's your tip percentage?");
            int percentage = scan.nextInt();
            System.out.println("Enter the cost in dollars and cents. (-1 to end)");
        }
    }