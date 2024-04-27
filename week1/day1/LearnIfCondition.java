package week1.day1;

public class LearnIfCondition {
	
	public static void main(String[] args) {
		
		int input = 0;
		// Output = Print whether the given input is positive or negative or neutral
		
		// type if -> ctrl+space -> click enter
		if (input>0) { // boolean -> -96>0 -> f
			System.out.println("The number is positive");	
		}
		else if(input<0) { // -96 <0 -> t
			System.out.println("The number is negative");
		}
		else {
			System.out.println("The number is neutral");
		}
		
		System.out.println("Done");
		
	}

}
