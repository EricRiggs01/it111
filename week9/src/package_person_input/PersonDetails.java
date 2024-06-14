package package_person_input;

import java.util.Scanner;

public class PersonDetails {

    public static void main(String[] args) {
// we need to create an object
        Person customer;
        customer = new Person();
        // We will be initalizing addional variables

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name!");
        customer.name = input.next();
        System.out.println("Please enter your age!");
        customer.age = input.nextInt();
        System.out.println("Please enter your gender!");
        customer.gender = input.next().charAt(0);
        System.out.println("Please enter your zipcode!");
        customer.zipCode = input.next();
    }
}
