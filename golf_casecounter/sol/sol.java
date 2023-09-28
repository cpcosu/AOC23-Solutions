package golf_casecounter.sol;

public class sol {
	public static void main(String[] z) {
		var i = new java.util.Scanner(System.in);
		int a = i.nextInt(), b = i.nextInt();	// a=uppercase counter, b=lowercase
		i.nextLine();	// read '\n' char
		String l="\n",u="";
		for(char c:i.nextLine().toCharArray()){
			if(c<'a'){
				if(a-->0)u+=c;
			}
			else{
				if(b-->0)l+=c;
			}
			// Compressed using ternary operators:
			//var v=((c<'a')?(u+=(a-->0)?c:""):(l+=(b-->0)?c:""));
		}
		System.out.println(u + l);
	}
	// COMPRESSED: 271 chars
	// public class s{public static void main(String[]z){var i=new
	// java.util.Scanner(System.in);int
	// a=i.nextInt(),b=i.nextInt();i.nextLine();String l="\n",u="";for(char
	// c:i.nextLine().toCharArray()){u+=(a-->0)?c:"";l+=(b-->0)?c:"";}System.out.println(u+l);}

}
