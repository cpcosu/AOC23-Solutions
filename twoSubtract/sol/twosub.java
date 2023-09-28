import java.util.*;

public class twosub {
    public static void main(String[] args) {
        // Open input Scanner
        Scanner in = new Scanner(System.in);

        // Read the input
        int target = in.nextInt();
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int temp = in.nextInt();
            list.add(temp);
        }

        // Initialize indices
        int index0 = -1;
        int index1 = -1;

        // Check each integer in the list for a matching integer
        for (Integer x : list) {
            int check0 = -1 * (target - x); // The value needed in the list for x to be the first index.
                                            // target = x - check0 (solve for check0)
            int check1 = target + x; // The value needed in the list for x to be the second index.
                                     // target = check1 - x (solve for check1)

            if (list.contains(check0)) {
                // x - check0 = target
                index0 = list.indexOf(x);
                index1 = list.indexOf(check0);
            } else if (list.contains(check1)) {
                // check1 - x = target
                index0 = list.indexOf(check1);
                index1 = list.indexOf(x);
            }
        }

        // Print the indices
        System.out.println(index0 + " " + index1);

        // Close the Scanner
        in.close();
    }
}