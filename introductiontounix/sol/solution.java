
//Java solution
import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        // number of testcases
        int num_test = Integer.parseInt(scnr.nextLine());
        // a hashset is ideal because we're storing/looking up unique filenames
        Set<String> set = new HashSet<>();
        // get/process input
        for (int i = 0; i < num_test; i++) {
            // get filename and store in set
            String command = scnr.nextLine();
            // Get the file name
            String file = command.substring(3);
            // Add the string to the set (does nothing if already in it)
            set.add(file);
        }
        // set already stores only unique elements
        System.out.println(set.size());

        // CLose the scanner
        scnr.close();
    }
}
