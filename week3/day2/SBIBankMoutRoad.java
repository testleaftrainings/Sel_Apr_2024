package week3.day2;

public abstract class SBIBankMoutRoad extends SBIBank implements RBI{
	
	public void knowYourCustomer() {
		System.out.println("License");
		
	}
	
	public void homeLoan() {
		System.out.println("4.5% interest rate");
	}
	
	public abstract void cibilScore();

}
