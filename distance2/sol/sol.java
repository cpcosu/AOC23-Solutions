package CPCProblemFall2023.distance2.sol;

import java.util.*;

public class sol {
    public static void main(String[] args) {
        // Create the scanner
        Scanner in = new Scanner(System.in);

        // Create an ArrayList to store all the points
        ArrayList<Integer> nums = new ArrayList<Integer>();
        // Read the number of points
        int lines = in.nextInt();
        // Add each point to the ArrayList
        for (int i = 0; i < lines; i++) {
            nums.add(in.nextInt());
        }
        // Sort the ArrayList into ascending order
        nums.sort(Comparator.naturalOrder());

        // Initialize the min distance as the largest possibility
        int minDistance = Integer.MAX_VALUE;
        // Iterate over each point to calculate distances
        for (int i = 1; i < nums.size(); i++) {
            // Update minDistance if the new points are closer
            minDistance = Math.min(nums.get(i) - nums.get(i - 1), minDistance);
        }
        // Print minDistance
        System.out.println(minDistance);

        // Close the scanner
        in.close();
    }
}