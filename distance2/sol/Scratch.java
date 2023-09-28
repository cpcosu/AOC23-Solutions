package CPCProblemFall2023.distance2.sol;

import java.util.Arrays;
import java.util.Scanner;

public final class Scratch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int quant = s.nextInt();
        Integer[] distsa = new Integer[quant];
        for (int i = 0; i < quant; i++) {
            distsa[i] = s.nextInt();
        }

        Arrays.sort(distsa);
        int dist = Integer.MAX_VALUE;
        for (int i = 0; i < quant - 1; i++) {
            if (Math.abs(distsa[i] - distsa[i + 1]) < dist) {
                dist = Math.abs(distsa[i] - distsa[i + 1]);
            }
        }

        System.out.println(dist);

    }
}