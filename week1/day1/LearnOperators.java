package week1.day1;

public class LearnOperators {
	// to run -> shortcut key -> ctrl+f11
	public static void main(String[] args) {
		// Arithmetic Operators
		int a=10;
		int b=5;
        System.out.println(a+b); // Addition
        System.out.println(a-b); // Subtraction
        System.out.println(a*b); // multiply
        System.out.println(a/b); // quotient
        System.out.println(a%b); // remainder
		
		// Comparison Operators
        System.out.println(a == b);
        System.out.println(a != b); 
        
		// Logical Operators
        System.out.println(a > b);// t
        System.out.println(a < b); // f
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a > b && a<b);  // T && f
        System.out.println(a > b || a<b); // T || F
        
        System.out.println(a++); // post increment
        System.out.println(a);
        
        System.out.println(++a); // pre-increment
	
	}

}
