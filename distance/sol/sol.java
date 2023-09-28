package CPCProblemFall2023.distance.sol;

import java.util.*;

public class sol {
    public static void main(String[] args) {
        // Create scanner
        Scanner in = new Scanner(System.in);

        // Read the amount of numbers
        int lines = in.nextInt();
        // Initial;ize the min distance as the largest possible
        int minDistance = Integer.MAX_VALUE;
        // Get the starting point
        int lastPoint = in.nextInt();
        // Read in each point, and check its distance
        for (int i = 1; i < lines; i++) {
            // Read this point
            int thisPoint = in.nextInt();
            // Find the distance between this point and the last point
            int distance = thisPoint - lastPoint;
            // Check if the distance is smaller
            minDistance = Math.min(minDistance, distance);
            // Store this point as last point
            lastPoint = thisPoint;
        }
        // Print the min distance
        System.out.println(minDistance);

        // Close the scanner
        in.close();
    }
}
