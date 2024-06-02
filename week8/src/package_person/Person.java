package package_person;

public class Person {

    String name; // Keeping the data type for the customer's name
    int age;
    int carYear; // Change to carYear
    char gender;
    boolean violations;
    int creditScore;

    public void display() {
        System.out.println("Customer name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Car Year: " + carYear); // Display the year of the car
        System.out.println("Gender: " + gender);
        System.out.println("Violations: " + violations);
        System.out.println("Credit Score: " + creditScore);
    }

    public double getRate(double monthlyRate) {
        if (violations && creditScore <= 700) {
            monthlyRate = 500.00;
        } else {
            monthlyRate = 100.00;
        }
        return monthlyRate;
    }

    public double assumeGender(double adjustedRate) {
        if (gender == 'M' && age <= 25) {
            adjustedRate = 100;
        } else {
            adjustedRate = 0;
        }
        return adjustedRate;
    }

    // Method to determine insurance premiums based on car age
    public double determinePremium(double monthlyRate) {
        int currentYear = 2024;
        int carAge = currentYear - carYear; // Calculate the age of the car

        if (carAge < 5) {
            // Car is newer, increase premium
            monthlyRate += 50.00;
        } else {
            // Car is older, decrease premium
            monthlyRate -= 50.00;
        }
        return monthlyRate;
    }
}