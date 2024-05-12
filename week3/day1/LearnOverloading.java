package week3.day1;

public class LearnOverloading {

	public void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}

	public void add(int a, float b) {
		System.out.println(a+b);
	}

	public void add(float a, int b) {
		System.out.println(a+b);
	}

	public void add(int a, float b,int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		LearnOverloading lo = new LearnOverloading();
		lo.add(4.5f, 89);
		lo.add(23, 5.6f, 90);
	}

}
