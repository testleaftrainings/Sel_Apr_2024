package week1.day2;

public class LearnObjects {
	
	 void sub(int a, int b) {
		System.out.println(a-b);

	}
	
	public static void main(String[] args) {
		LearnMethods obj = new LearnMethods();
		obj.getCycleNumber();
		
		LearnObjects lo = new LearnObjects();
		lo.sub(89, 70);
		
	}

}
