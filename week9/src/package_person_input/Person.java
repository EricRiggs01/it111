package package_person_input;

public class Person {
    // no main method
    // creating our fields

    String name;
    char gender;
    String zipCode;
    int age;
    double baselineRate;

    int cityCode;

    // we have our individual violation, as well as the main violations
    boolean violations;
    boolean violationDUI;
    boolean violationRedLight;
    boolean violationSpeeding;


    double creditScore;
    double adjustedRate;


    // creating a method named display, so that we can print the information in one fell swoop.

    public void display() {
        System.out.println("This what you have entered!");
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(zipCode);
        System.out.println("Your baseline rate:" +baselineRate+ " dollars");
        System.out.println("Don't forget that your total rate may change due to violations, age and credit score." );
        System.out.println("Violations:" +violations);
        System.out.println("Violations:" +violationDUI);
        System.out.println("Violations:" +violationRedLight);
        System.out.println("Violations:" +violationSpeeding);
        System.out.println("Credit Score:" +creditScore);

    }

    // create a method - violations and credit score
    // violations or credit score

    public double getRate(double monthlyRate) {
        if(violations = true || creditScore <= 700) {
            monthlyRate = 300.00;
        } else {
            monthlyRate = 0;
        }
        return monthlyRate;
    }

    // new method for age

    public double ageCategory(double AdjustedRate) {
        if(age <= 25 || age >= 65) {
            adjustedRate = 300.00;
        } else {
            adjustedRate = 0;
        } return adjustedRate;
    }

    // our method for states/zipcodes/strings/changing your string to an integer.

    public int identifyRegion(int states) {
        // 90 -96 ca, 97 - or, 98 and 99 wa
        String zip2;
        zip2 = zipCode.substring(0, 2);
        cityCode = Integer.parseInt(zip2);

        if(cityCode>= 90 && cityCode <97) {

            System.out.println("You entered" +zipCode+ " and you're from California!");

        } else if (cityCode == 97) {
            System.out.println("You entered" +zipCode+ " and you're from California!");


        } else if (cityCode >=98 && cityCode <=99) {
            System.out.println("You entered" +zipCode+ " and you're from California!");


        } else {
            System.out.println("You're not from the Pacific North West, please contact our National Office!");


        } return states;
    }

}
