package week3.day2;

public class SBIBank implements RBI,Payments{

	public void knowYourCustomer() {
		System.out.println("AADHAR");
		
	}

	public int withDrawalLimit() {
		
		return 25000;
	}

	public void repoRate() {
		System.out.println("9%");
		
	}
	
	public void upiPayment() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		SBIBank sbi = new SBIBank();
		sbi.knowYourCustomer();
		System.out.println(sbi.withDrawalLimit());
		sbi.repoRate();
	}

	

}
