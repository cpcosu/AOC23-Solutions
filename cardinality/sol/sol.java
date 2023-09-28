import java.util.*;

class sol{
	public static void main(String args[]){
		// Create the scanner
		Scanner in = new Scanner(System.in);

		// Read in the set
		String line = in.nextLine();
		// Track set size (count) and number of '{' (track)
		int count=0, track=0;
		
		// remove leading and trailing {}, and iterate
		var ar = line.substring(1, line.length()-1).toCharArray();
		// We have passed an element of # of '{' = # of '}'
		for(char c:ar){
			// If current character is ',' or ' ', loop to next character
			if(c==',' || c==' ')continue;
			// If current character is '{', increment track, else decrement track
			track+=(c=='{')?1:-1;
			// If track = 0, i.e. a closed set, increment count
			count+=(track==0)?1:0;
		}
		// Print the cardinality
		System.out.println(count);

		// Close the scanner
		in.close();
	}
}
