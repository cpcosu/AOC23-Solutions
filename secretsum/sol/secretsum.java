public class secretsum {
	public static void main(String[] args) {
		// scan an array of secret numbers, all in 1 line :sunglasses:
		var nums = new java.util.Scanner(System.in).nextLine().split("t");
		int sum = 0, i = 1;
		// start at index 1 in the array,
		// because the 0th place has the starting section of numbers (no 'psst' yet)
		while (i < nums.length)
			sum += nums[i++].charAt(0) - '0';
		System.out.println(sum);
	}

	// COMPRESSED: 188 chars
	// public class s{public static void main(String[]a){var n=new
	// java.util.Scanner(System.in).nextLine().split("t");int
	// s=0,i=1;while(i<n.length)s+=n[i++].charAt(0)-'0';System.out.println(s);}}
}