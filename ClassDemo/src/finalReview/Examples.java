package finalReview;

public class Examples {
    public static void main(String args[]) {
        // Ternary operator
        int temp = 81;
        String output = (temp > 80) ? "It's hot" : (temp > 65) ? "It's warm" : "It's chilly";
        System.out.println(output);

        // Nested loop
        String[] states = {"Iowa", "Nebraska", "Colorado"};
        for(int i = 0; i < states.length; i++) {
            int j = states[i].length() - 1;
            while(j >= 0) {
                System.out.print(states[i].charAt(j));
                j--;
            }
            System.out.println();
        }

        // Reference variables
        String[] states2 = states; // I am assigning a new reference to the states array
        states2[1] = "Missouri"; // I am using the new reference to change a value
        for(String state: states) {
            System.out.println(state); // Prints Iowa, Missouri, Colorado
        }

    }
}
