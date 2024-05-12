package week3.day1;

public class StringMethods {
	public static void main(String[] args) {
		String input ="Chennai600073";
		String substring = input.substring(7);
		System.out.println(substring);
		// output = 600073
		String replace = input.replaceAll(",", " ");
		System.out.println(replace);
		// convert the given String into int
//		int actNumber = Integer.parseInt(replace);
//		System.out.println(actNumber);
	}

}
