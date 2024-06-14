import java.util.InputMismatchException;
import java.util.Scanner;

public class DailySpecials2 {
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
        } else if (orderNum >= 2 && orderNum <= 4) {
            System.out.println("Looks like you will be ordering " + orderNum + " " + coffee + "s today!");
            double total = price * orderNum;
            System.out.printf("Total amount: $%.2f%n", total);
        } else if (orderNum >= 5 && orderNum <= 9) {
            System.out.println(orderNum + " " + coffee + "s have been ordered.");
            double discount = 0.10; // 10% discount
            double regularPrice = price * orderNum;
            double discountedPrice = regularPrice * (1 - discount);
            System.out.printf("A group discount! Your regular price is: $%.2f%n", regularPrice);
            System.out.printf("You have ordered %d %s but will only be charged $%.2f dollars!%n", orderNum, coffee, discountedPrice);
        } else if (orderNum >= 10) {
            System.out.println(orderNum + " " + coffee + "s have been ordered.");
            double discount = 0.20; // 20% discount
            double regularPrice = price * orderNum;
            double discountedPrice = regularPrice * (1 - discount);
            System.out.printf("A bigger group discount! Your regular price is: $%.2f%n", regularPrice);
            System.out.printf("You have ordered %d %s but will only be charged $%.2f dollars!%n", orderNum, coffee, discountedPrice);
        } else {
            System.out.println("Try it again using a positive number please.");
        }

        input.close();
    }
}