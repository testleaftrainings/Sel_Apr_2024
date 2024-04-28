package week1.day2;

public class LearnMethods {
	
	//type method name -> do ctrl + space -> click enter 
    // accessmodifier returntype methodname input argument	
	public int getCycleNumber() {
		return 2;
	}
	
	private void getCreditCardNumber() {
		System.out.println("Card Number");

	}
	
	public String getBrandName(String name,String color) {
		return name+" "+color;

	}
	
	public float addTwoNumbers(int a,float b) {
		return a+b;

	}
	
	public static void main(String[] args) {
		//Classname objectname = new Classname();
		LearnMethods lm = new LearnMethods();
		System.out.println(lm.getBrandName("Honda", "Red"));
		System.out.println(lm.getBrandName("Bajaj", "Yellow"));
		System.out.println(lm.addTwoNumbers(88, 90.78f));
		System.out.println(lm.getCycleNumber());
		lm.getCreditCardNumber();
	}

}
