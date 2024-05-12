package week3.day1;

public class ReverseString {
	
	public static void main(String[] args) {
		String input = "Subraja";
		//output = ajarbus
		// convert the given input to charArray
		char[] ch = input.toCharArray();
		// iterate through the characters in reverse
		for (int i = ch.length-1; i>=0 ; i--) {
			// print the output
			System.out.print(ch[i]);
		}
		
		
	}

}
