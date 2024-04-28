package week1.day2;

public class LearnBreakStatement {
	
	public static void main(String[] args) {
		// break,continue  -> Jump statements
		// When i find the number 3 -> print the number 3 in words and stop the iteration
		
		for (int i = 1; i <=10; i++) { // i=3; 3<=10-> t 
			if(i==3) {  //3==3 -> t
				System.out.println("Three"); // Three
				break;
			}
			System.out.println(i); // 1 2 
			
		}
		System.out.println("Out of the loop");
	}

}
