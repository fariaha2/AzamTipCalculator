import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double cost = 0;

            System.out.println("Welcome to the tip calculator!");
            System.out.println("How many people are in your group?");
            int numOfPeople = scan.nextInt();
            System.out.println("What's your tip percentage?");
            double percentage = scan.nextDouble();
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
            double totalTip = (percentage/100) * total;
            double billWithTip = totalTip + total;
            double beforeTip = total/numOfPeople;
            double tipPerPerson = totalTip/numOfPeople;
            double costPerPerson = tipPerPerson+beforeTip;
            System.out.println("-----------------");
            System.out.println("Total bill before tip: " + total);
            System.out.println("Total percentage: " + percentage);
            System.out.println("Total tip: " + totalTip);
            System.out.println("Total bill with tip: " + billWithTip);
            System.out.println("Per person cost before tip: " + beforeTip);
            System.out.println("Tip per person: " + tipPerPerson);
            System.out.println("Total cost per person: " + costPerPerson);

        }
    }