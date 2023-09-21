import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double cost = 0;

            System.out.println("Welcome to the tip calculator!");
            System.out.println("How many people are in your group?");
            int numOfPeople = scan.nextInt();
            System.out.println("What's your tip percentage?");
            int percentage = scan.nextInt();
            System.out.println("Enter the cost in dollars and cents. (-1 to end)");
            cost = scan.nextDouble();
            double total = cost;
            if(cost!= -1) {
                while (cost != -1) {
                    System.out.println("Enter the cost in dollars and cents. (-1 to end)");
                    cost = scan.nextDouble();
                    total = total + cost;
                }
            }
            total = total + 1;
            System.out.println("------------------");
            System.out.println(total);
        }
    }