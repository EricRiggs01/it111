package package_person;

public class PersonDetails {
    public static void main(String[] args) {

        Person firstPerson;
        Person secondPerson;
        Person thirdPerson;

        firstPerson = new Person();
        secondPerson = new Person();
        thirdPerson = new Person();

        // Assigning values to the fields
        firstPerson.name = "Cathy";
        firstPerson.age = 33;
        firstPerson.carYear = 2021; // Change to carYear
        firstPerson.gender = 'F';
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendall";
        secondPerson.age = 22;
        secondPerson.carYear = 2019; // Change to carYear
        secondPerson.gender = 'M';
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        thirdPerson.name = "Arial";
        thirdPerson.age = 54;
        thirdPerson.carYear = 2016; // Change to carYear
        thirdPerson.gender = 'F';
        thirdPerson.violations = true;
        thirdPerson.creditScore = 600;

        double monthlyRate = 0;

        System.out.println("First Person:");
        firstPerson.display();
        monthlyRate = firstPerson.getRate(monthlyRate);
        monthlyRate = firstPerson.determinePremium(monthlyRate);
        System.out.println("Total Monthly Premium: $" + monthlyRate);

        System.out.println();

        System.out.println("Second Person:");
        secondPerson.display();
        monthlyRate = secondPerson.getRate(monthlyRate);
        monthlyRate = secondPerson.determinePremium(monthlyRate);
        System.out.println("Total Monthly Premium: $" + monthlyRate);

        System.out.println();

        System.out.println("Third Person:");
        thirdPerson.display();
        monthlyRate = thirdPerson.getRate(monthlyRate);
        monthlyRate = thirdPerson.determinePremium(monthlyRate);
        System.out.println("Total Monthly Premium: $" + monthlyRate);
    }
}