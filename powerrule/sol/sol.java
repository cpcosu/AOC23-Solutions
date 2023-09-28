import java.util.*;

public class sol {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String result = "";
		// read polynomial as individual terms
		String[] terms = in.nextLine().split(" \\+ ");
		int k = Integer.parseInt(in.nextLine());
		// for each term of the polynomial
		for (String term : terms) {
			// kth deriv is appended to result
			result += deriv(term, k);
		}
		// print result ignoring last " + "
		if (result.length() > 3)
			System.out.println(result.substring(3));
		else {
			System.out.println(0);
		}
		in.close();
	}

	// calculate derivative of a single term in the polynomial
	public static String deriv(String term, int k) {
		int indexOfX = term.indexOf("x");
		if (indexOfX == -1) { // x does not occur => term is a constant
			return "";
		}
		if (indexOfX == term.length() - 1) { // x is final character => term degree = 1
			term += "^1";
		}
		if (indexOfX == 0) { // x is first character => constant = 1
			term = "1" + term;
			indexOfX++;
		}

		int constant = Integer.parseInt(term.substring(0, indexOfX));
		int exponent = Integer.parseInt(term.substring(indexOfX + 2));
		if (k > exponent)
			return "";
		while (k-- > 0) {
			constant *= exponent--;
		}

		if (constant == 0)
			return "";
		String result = " + " + constant;

		if (exponent == 0) {
			return result;
		} else
			result += "x";
		if (exponent > 1)
			result += "^" + exponent;
		return result;
	}
}