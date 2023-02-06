import java.util.Scanner;

public class WedJan25 {
    public static void main(String[] args) {
        double weight2 = 190000;
        System.out.printf("You would weight %,.2f pounds on the Moon.\n", weight2 * (1 / 6.0));

        // Java Comment
        System.out.println("Hello"); // Another comment
//        System.out.println();
//        System.out.println();
//        System.out.println();
        /*
          Longer
          Java Comment
         */


        String myFirstName = "Marc";
        char middleInitial = 'L';
        Character myMiddleInitial = 'L';
        int myAge = 42;
        Integer age = 42;
        double myWeight = 190.5;
        Double weight = 190.5;
        boolean likesPizza = true;
        float currentTemp = 30;
        long reallyLongNumber = 999999999999999999L;
        int reallyLongInt = 999999999;
        int biggestInt = Integer.MAX_VALUE;
        int a = 7;
        int b = 2;
        System.out.println(a / b); // Python would print 3.5, Java print 3
        System.out.println(7 / 2.0); // 3.5
        System.out.println(7.0 / 2); // 3.5
        System.out.println(7.0 / 2.0); // 3.5
        System.out.println((double)a / b); // 3.5
        System.out.println(a + b); // 9
        System.out.println(a - b); // 5
        System.out.println(a * b); // 14
        System.out.println(a % b); // 1
        int c = 3;
        System.out.println(a + b * c); // 13
        System.out.println((a + b) * c); // 27
        System.out.println(Math.min(a, b)); // 2

        String fName = "Marc";
        String lName = "Hauschildt";
        System.out.println(fName + lName); // MarcHauschildt
        System.out.println(fName + " " + lName); // Marc Hauschildt
        System.out.println(fName + " " + lName + " is " + myAge + " years old.");
        System.out.printf("%s %s is %d years old\n", fName, lName, myAge);
        int x = 2;
        double y = 1.1;
        System.out.println(x - y);
        System.out.printf("%.1f\n", x-y);

        int favNum;
        favNum = 34;
        int num1, num2;
        double d1, d2;
        num1 = 5;
        num2 = 2;
        d1 = 2.5;
        d2 = 5.2;
//        num1 = d1; // Cannot assign a double to an int
        d1 = num1; // Can assign an int to a double
        long l1 = 99L;

        double gallons;
        double liters;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter gallons: ");
        gallons = scanner.nextDouble();
        liters = gallons * 3.7854;
        System.out.printf("%f gallons is approximately %.2f liters\n", gallons, liters);
        int someNum = scanner.nextInt();
        String someName = scanner.nextLine();
    }
}
