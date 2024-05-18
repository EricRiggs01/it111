import java.util.Scanner;

public class MyInput {
    public static void main(String[] args) {

        String name, message;
        int age;
        double salary;


        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your first name, please!");

        name = myObj.next();

        System.out.println(name+", please enter your age!");

        age = myObj.nextInt();

        System.out.println(name+", last, but not least your annual salary!");

        salary = myObj.nextDouble();

        if(salary < 50000) {
            message = "I need another job, or a roommate.";

        } else if(salary >= 50000 && salary < 60000) {
            message = "Not bad, but hard to survive in Seattle";
        } else if(salary >= 60000 && salary < 70000) {
            message = "Salary is getting better";
        } else if(salary >= 70000 && salary < 80000) {
            message = "Almost liveable in Seattle";
        } else {
            message = "Life is good";
        }


        System.out.println("First Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Salary: " +salary+ " dollars");
        System.out.println("Message: " +message);



    }
}
