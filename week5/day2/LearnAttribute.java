package testcases;

import org.testng.annotations.Test;

public class LearnAttribute {

	@Test(priority=1)
	public void createLead() {
		System.out.println("Create Lead");
	}
	
	@Test(priority=2,enabled = false)
	public void mergeLead() {
		System.out.println("Merge Lead");
	}
	@Test
	public void deleteLead() {
		System.out.println("Delete Lead");
	}
	
}
