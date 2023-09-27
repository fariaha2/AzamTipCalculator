import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double cost = 0;
            int numOfItem = 0;
            int totalNumOfItem = 0;

            System.out.println("Welcome to the tip calculator!");
            System.out.println("How many people are in your group?");
            int numOfPeople = scan.nextInt();
            System.out.println("What's your tip percentage?");
            double percentage = scan.nextDouble();
            System.out.println("Enter the cost in dollars and cents. (-1 to end)");
            cost = scan.nextDouble();
            double total = cost;
            System.out.println("How many of this item did you order?");
            numOfItem = scan.nextInt();
            totalNumOfItem = numOfItem;
            if(cost!= -1) {
                while (cost != -1) {
                    System.out.println("Enter the cost in dollars and cents. (-1 to end)");
                    cost = scan.nextDouble();
                    if(cost!= -1) {
                        System.out.println("How many of this item did you order?");
                        numOfItem = scan.nextInt();
                        totalNumOfItem = totalNumOfItem+numOfItem;
                        total = total + cost*numOfItem;
                    }
                }
            }
            total = total + 1;
            double totalTip = ((double) ((int) (((percentage / 100) * total)*100))) / 100;
            double billWithTip = ((double) ((int) ((totalTip + total)*100))) / 100;
            double beforeTip = ((double) ((int) ((total/numOfPeople)*100))) / 100;
            double tipPerPerson = ((double) ((int) ((totalTip/numOfPeople)*100))) / 100;
            double costPerPerson = ((double) ((int) ((beforeTip+tipPerPerson)*100))) / 100;
            System.out.println("-----------------");
            System.out.println("Total number of items ordered: " + totalNumOfItem);
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