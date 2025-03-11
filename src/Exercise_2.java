
import java.util.Scanner;
//Multiple of 100 (Exercise 2)
//Write a program that reads an integer and checks whether it is a multiple of 100.
//If the number is multiple of 100, the program should print "The number is multiple of 100".
//If the number is not multiple of 100, the program should print "The number is not multiple of 100".
public class Exercise_2 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            if (num % 100 == 0) {
                System.out.println("The number is multiple of 100");
            } else {
                System.out.println("The number is not multiple of 100");
            }
        }
        }
    }
    
