public class MyOperators {
    public static void main(String[] args) {

        // Arithmetic operators
        // employee, wage, hours worked, overtime, the whole enchalata

//        int reghours, overtimehours;
//        double overtimepay, regularpay, total;
//        float wage;
//        double hourlywithovertime;
//
//        reghours = 40;
//        overtimehours = 5;
//        wage = 25.50F;
//        regularpay = reghours * wage;
//        overtimepay = (wage * 1.5) * overtimehours;
//        total = overtimepay + regularpay;
//        hourlywithovertime = total / (reghours + overtimehours);
//
//        System.out.println("Regular pay: $" +regularpay+ " dollars");
//        System.out.println("Overtime pay: $" +overtimepay+ " dollars");
//        System.out.println("Total pay: $" +total+ " dollars");
//        System.out.println("Hourly rate with overtime: $" +hourlywithovertime+ " dollars");
//        System.out.print("Hourly rate with overtime: $");
//        System.out.printf("%.2f", hourlywithovertime);

        // modulus operator

        int number1, number2, number3;
        number1 = 2577;
        number2 = 2;
        number3 = number1 % number2;

        if(number3 == 0) {
            System.out.println(number1+ " is an even number");

        } else {
            System.out.println(number1+ " is an odd number");
        }
        System.out.println(number3);
// we are now going shopping
//

//        double priceOfItem =  100;
        // tax is 10 percent

        double priceOfItem =  100;
        priceOfItem *= 1.10;

        System.out.println("Total price of item is" +priceOfItem+ " dollars");
        System.out.print("Total price of item is: " );
        System.out.printf("$%.2f", priceOfItem );
        System.out.print(" dollars" );

    }


}
