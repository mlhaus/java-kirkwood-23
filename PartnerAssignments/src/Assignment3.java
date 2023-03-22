import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        
    }

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
