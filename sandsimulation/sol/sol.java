import java.util.*;

public class sol {
    public static void main(String[] args) {
        // Open input Scanner
        Scanner in = new Scanner(System.in);

        // Read the input
        int width = in.nextInt();
        int height = in.nextInt();
        int drop = in.nextInt();
        int num = in.nextInt();

        int[][] grid = new int[height][width];

        // Simulate every drop individually
        for (int i = 0; i < num; i++) {
            int partR = 0;
            int partC = drop;
            while (partR < height - 1) {
                if (grid[partR + 1][drop] != 1) {
                    // Go down if open
                    partR++;
                } else if (partC + 1 < width && grid[partR + 1][partC + 1] != 1) {
                    // Go down and right if open
                    partR++;
                    partC++;
                } else if (partC - 1 > 0 && grid[partR + 1][partC - 1] != 1) {
                    // Go down and left if open
                    partR++;
                    partC--;
                } else {
                    // Stop simulating if no more open options
                    break;
                }
            }
            // Mark the particle's location
            grid[partR][partC] = 1;
        }

        // Print the grid
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == 1) {
                    System.out.print(".");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Close the Scanner
        in.close();
    }
}