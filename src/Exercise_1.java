
import java.util.Scanner;
//Even or Odd (Exercise 1)
public class Exercise_1 {
    public static void main(String[] args) {
        //Scanner method to get user input
        try (Scanner scan = new Scanner(System.in)) { //try-with-resources to avoid resource leak errors
            //Prompt user to enter a number
            System.out.println("Enter a number: ");
            //Store user input in num variable
            int num = scan.nextInt();
            //If the rest of the division of num by 2 is equal to 0 print "Even", else print "Odd"
            //ternary operator: (condition) ? value_if_true : value_if_false
            System.out.println("The number is: " + (num % 2 == 0 ? "Even" : "Odd"));
        }
    }
}
