import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class solution {
    public static void main(String[] args) {
        // Create the scanner
        Scanner scnr = new Scanner(System.in);

        // Read the number of commands
        int num_test = Integer.parseInt(scnr.nextLine());
        // Create a HashMap to store unique file names and contents
        Map<String, String> files = new HashMap<>();
        // Read commands until cat
        while (true) {
            // Read the command
            String command = scnr.nextLine();
            if (command.substring(0, 2).equals("vi")) { // Command is vi
                // Get the file name
                String fileName = command.substring(3);
                // Reset the file
                files.put(fileName, "");

                // Append lines to the file contents until :wq
                String line = scnr.nextLine();
                while (!line.equals(":wq")) {
                    // Update file's contents
                    files.put(fileName, files.get(fileName) + line + "\n");
                    // Read the next line
                    line = scnr.nextLine();
                }
            } else { // Command is cat
                // Print the contents of the file
                System.out.println(files.get(command.substring(4)));

                // Close the scanner
                scnr.close();
                // Break out of the loop
                break;
            }
        }
    }
}
