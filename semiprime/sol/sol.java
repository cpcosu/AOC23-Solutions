package CPCProblemFall2023.semiprime.sol;

import java.util.Scanner;
import java.util.ArrayList;

public class sol {
    public static void main(String[] args) {
        // Create the scanner
        Scanner in = new Scanner(System.in);

        // Split the input at " ", and parse the 3rd index as an int
        // "Bartholomew says <bar>"
        int bar = Integer.parseInt(in.nextLine().split(" ")[2]);
        ArrayList<Integer> factors = new ArrayList<>();

        // Find all the factors of the number in (1, sqrt(bar)]
        for (int i = 2; i * i <= bar; i++) {
            if (bar % i == 0) {
                factors.add(i);
            }
        }

        // A semiprime number has a prime factorization with just 2 factors,
        // Thus must have one factor in (1, sqrt(bar)]
        if (factors.size() != 1) {
            System.out.println("Bartholomew, " + bar + " is NOT a prime-once-removed");
        } else {
            System.out.println("Bartholomew, " + bar + " is a prime-once-removed");
        }

        // Close the scanner
        in.close();
    }
}
