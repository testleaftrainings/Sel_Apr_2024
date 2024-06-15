package week8.day1;

public class LearnFinally {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;

		try {
			System.out.println(x/y);
		} 
//		catch (Exception e) {
//			if (y==0) {
//				System.out.println(x/1);
//			}
//		}
		finally {
			System.out.println("Finally block");
		}
		System.out.println("Done");
	}
}
