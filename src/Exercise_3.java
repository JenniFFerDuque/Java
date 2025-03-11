import java.util.Scanner;

public class Exercise_3 {
    //Method to compare two numbers within a tolerance using user stored values
    static void compareNumbers(double first_number, double second_number, double tolerance) {
        //If the absolute difference between first_number and second_number is less than or equal to tolerance
        if (Math.abs(first_number - second_number) <= tolerance) {
            //Print "equals"
            System.out.println("equals");
        } else {
            //Print "not equals"
            System.out.println("not equals");
        }
    }

    public static void main(String[] args) {
        //Scanner method to get user input
        try (Scanner scan = new Scanner(System.in)) { //try-with-resources to avoid resource leak errors
            //Prompt user to enter first number
            System.out.println("Enter your first number: ");
            //Store user input in first_number variable
            double first_number = scan.nextDouble();
            //Prompt user to enter second number
            System.out.println("Enter your second number: ");
            //Store user input in second_number variable
            double second_number = scan.nextDouble();
            //Prompt user to enter tolerance number
            System.out.println("Enter tolerance number: ");
            //Store user input in tolerance variable
            double tolerance = scan.nextDouble();
            //Call compareNumbers method to compare first_number and second_number within tolerance
            compareNumbers(first_number, second_number, tolerance);
        }
    }
}
