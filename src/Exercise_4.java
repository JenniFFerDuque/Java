
import java.util.Scanner;

public class Exercise_4 {
    //id's year extractor method (char array)
    static void yearExtractor(String id) {
        //Convert id to char array using toCharArray() method
        char[] idArray = id.toCharArray();
        //Extract year from array positions 0 and 1
        String year = "" + idArray[0] + idArray[1];
        //Print year
        System.out.println(year);
    }
    //id's year extractor method (substring)
    static void yearExtractor2(String id) {
        String year = id.substring(0, 2);
        System.out.println(year);  
    }


    public static void main(String[] args) {
        //Scanner method to get user input
        try(Scanner scan = new Scanner(System.in)){ //try-with-resources to avoid resource leak errors
            //Prompt user to enter ID
            System.out.println("Enter your ID: ");
            //Store user input in id variable
            String id = scan.nextLine();
            //Call yearExtractor method which uses char array (option 1)
            yearExtractor(id);
            //Call yearExtractor2 method which uses substring method (option 2)
            yearExtractor2(id);
            //result must be the same using both methods
        }
    }

}
