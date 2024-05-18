import java.util.Scanner;

public class dailySpecials {
    public static void main(String[] args) {
        String specials;
        int orderNum;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!");

        specials = input.next();

//        input.close();;
        // in the world of coffee, I need a name of a coffee beverage and a price

            String coffee;
            double price;

            boolean saturday = specials.equals("Saturday");
            boolean sunday = specials.equals("Sunday");
        if(saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();

        }


        switch (specials) {
            // my cases will be the day of the week
            case "Monday":
                coffee = "Latte";
                price = 4.95;
                break;

            case "Tuesday":
                coffee = "Frapp";
                price = 5.95;
                break;

            case "Wednesday":
                coffee = "Cappuccino";
                price = 4.35;
                break;

            case "Thursday":
                coffee = "Regular Joe";
                price = 2.95;
                break;

            case "Friday":
                coffee = "Green Tea Latte";
                price = 6.95;
                break;

            default:
                System.out.println("Please enter a valid day or check your spelling.");
                input.close();
                return;
        }

        System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + String.format("%.2f", price));
        System.out.println("How many " + coffee + "s would you like?");
        orderNum = input.nextInt();

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