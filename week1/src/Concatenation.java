public class Concatenation {
    public static void main(String[] args) {

        String color = "red";
        System.out.println("My Favorite color is " +color);

        int money = 2_000_000;
        System.out.println("I hit the jackpot and won $" +money+ " dollars!");

        System.out.println(color+" "+money);

        System.out.println("This will be my statement regarding my favoite color which is " +color+ " and will let you know that I won a $" +money+ " dollars!");

        boolean dry = true;
        if(dry) {
            System.out.println("Time to hang up those curtains!");
        } else {
            System.out.println("We will half to wait a while.");
        }

    }

}
