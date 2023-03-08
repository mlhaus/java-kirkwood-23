package utilities;

import java.util.Scanner;

public class UserInput {
    // Get string
    public static String getString(Scanner scanner, String prompt) {
        System.out.print(prompt + ": ");
        String value = scanner.nextLine();
        return value;
    }
    
    // Get boolean (Yes or No)
    public static boolean getBoolean(Scanner scanner, String prompt) {
        String value = "";
        do {
            System.out.print(prompt + " [Yes, No]: ");
            value = scanner.nextLine();
        } while(!value.equalsIgnoreCase("Yes") 
                && !value.equalsIgnoreCase("No") 
                && !value.equalsIgnoreCase("Y") 
                && !value.equalsIgnoreCase("N"));
        return value.equalsIgnoreCase("Yes") || value.equalsIgnoreCase("Y");
    }    
    // Get any number
    
    // Get a number no less than
    
    // Get a number within a range
    
    // Get a date
}
