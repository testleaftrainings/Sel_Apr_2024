package week8.day1;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;

		int[] nums = {10,20,30}; //indices 0 , 1, 2

		//particular exception
		try {
			System.out.println(x/y); // 10/5 -> pass
			System.out.println(nums[3]); // nums[3] -> fail
		} 
		catch (ArithmeticException e) { // ArrayIndexOutofBoundException
			if (y==0) {
				System.out.println(x/1);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Done");
	}
}
