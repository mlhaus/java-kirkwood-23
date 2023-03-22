package utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
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
    public static int getInt(Scanner scanner, String prompt) {
        return getInt(scanner, prompt, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    // Get a number no less than
    public static int getInt(Scanner scanner, String prompt, int min) {
        return getInt(scanner, prompt, min, Integer.MAX_VALUE);
    }
    // Get a number within a range
    public static int getInt(Scanner scanner, String prompt, int min, int max) {
        int value = 0;
        while(true) {
            System.out.print(prompt + " [from " + min + " to " + max + "]: ");
            try {
                value = scanner.nextInt();
                scanner.nextLine(); // read enter key press
                if(value < min || value > max) {
                    System.out.println("Value must be between " + min + " and " + max + ".");
                } else {
                    break;
                }
            } catch(InputMismatchException e) {
                scanner.nextLine(); // read enter key press
                System.out.println("Invalid number");
            }
        }
        return value;
    }
    // Get a date
    public static LocalDate getDate(Scanner scanner, String prompt) {
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("M/d/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("M-d-yyyy");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate userDate = null;
        while(true) {
            System.out.print(prompt + " [mm/dd/yyyy or yyyy-mm-dd]: ");
            String dateStr = scanner.nextLine();
            try {
                userDate = LocalDate.parse(dateStr, format1);
                break;
            } catch(DateTimeParseException e1) {
                try {
                    userDate = LocalDate.parse(dateStr, format2);
                    break;
                } catch(DateTimeParseException e2) {
                    try {
                        userDate = LocalDate.parse(dateStr, format3);
                        break;
                    } catch(DateTimeParseException e3) {
                        System.out.println("Invalid date format");
                    }
                }
            }
        }
        return userDate;
    }


    







}
