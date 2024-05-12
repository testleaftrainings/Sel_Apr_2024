package week3.day2;

public interface RBI extends Payments,SingaporeRBI{
	/**
	 * This method should collect the kyc
	 */
	public void knowYourCustomer();
	
	/**
	 * This method should mention the 
	 * withdrawal limit
	 */
	public int withDrawalLimit();
	
	public void repoRate();
	
	
	

}
