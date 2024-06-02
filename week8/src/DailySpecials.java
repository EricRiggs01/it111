import java.util.InputMismatchException;
import java.util.Scanner;

public class DailySpecials {
    public static void main(String[] args) {
        String specials;
        int orderNum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only):");
        specials = input.next().toLowerCase();

        // Ensure the input is a valid weekday
        while (!specials.equals("monday") && !specials.equals("tuesday") &&
                !specials.equals("wednesday") && !specials.equals("thursday") &&
                !specials.equals("friday")) {

            if (specials.equals("saturday") || specials.equals("sunday")) {
                System.out.println("Please enter a valid weekday, not a weekend day:");
            } else {
                System.out.println("Please enter a valid day of the week:");
            }
            specials = input.next().toLowerCase();
        }

        // Determine the coffee special and price for the valid weekday
        String coffee = "";
        double price = 0.0;

        switch (specials) {
            case "monday":
                coffee = "Latte";
                price = 4.95;
                break;
            case "tuesday":
                coffee = "Frappuccino";
                price = 5.95;
                break;
            case "wednesday":
                coffee = "Cappuccino";
                price = 4.35;
                break;
            case "thursday":
                coffee = "Regular Joe";
                price = 2.95;
                break;
            case "friday":
                coffee = "Green Tea Latte";
                price = 6.95;
                break;
        }

        System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + String.format("%.2f", price));

        boolean validInput = false;

        while (!validInput) {
            System.out.println("How many " + coffee + "s would you like?");
            try {
                orderNum = input.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer value.");
                input.next(); // consume the invalid input
            }
        }

        if (orderNum == 0) {
            System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
        } else if (orderNum == 1) {
            System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
        } else if (orderNum > 1) {
            System.out.print(orderNum + " " + coffee + "s have been ordered totaling $");
            double total = price * orderNum;
            System.out.printf("%.2f%n", total);
        } else {
            System.out.println("Try it again using a positive number please.");
        }

        input.close();
    }
}