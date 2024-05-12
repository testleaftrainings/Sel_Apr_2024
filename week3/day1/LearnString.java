package week3.day1;

public class LearnString {
	
	public static void main(String[] args) {
		// String literal
		String str = "TestLeaf";
		str = str.toLowerCase();// testleaf
		String str1 = "TestLeaf";
		
		//String Objects
		String str2 = new String("TestLeaf");
		
		// to find the total characters in the String
		int length = str.length();
		System.out.println("The total length is : "+length);
		
		// equals() to compare two Strings
		// equalsIgnoreCase() -> compare two String ignoring the case sensitivity
		if (str.equalsIgnoreCase(str1)) {
			System.out.println("Both are equal");
		}else {
			System.out.println("Both are not equal");
		}
		
		// contains() -> to check whether the part of the String is present or not
		if (str.contains("leaf")) {
			System.out.println("Present");
		}else {
			System.out.println("Not Present");
		}
		
		// to convert the given String to character array
		char[] ch = str.toCharArray();
		System.out.println(ch[6]);
		
		// charAt
		System.out.println(str.charAt(7));
		
	}

}
