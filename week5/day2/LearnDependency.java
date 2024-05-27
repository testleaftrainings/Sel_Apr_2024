package testcases;

import org.testng.annotations.Test;

public class LearnDependency extends BaseClass{

	@Test(enabled=false)
	public void createLead() {
		System.out.println("Create Lead");
		//throw new RuntimeException();
	}
	
	@Test(dependsOnMethods = "testcases.LearnDependency.createLead")
	public void editLead() {
		//packagename.classname.methodname
		System.out.println("edit Lead");
		throw new RuntimeException();
	}
	
	@Test(dependsOnMethods = {"testcases.LearnDependency.createLead","testcases.LearnDependency.editLead"})
	public void deleteLead() {
		System.out.println("Delete Lead");
	}
	
	
	
	
	
	
	
}
