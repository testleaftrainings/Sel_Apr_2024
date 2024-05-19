package week4.day2;

public class EmployeeDetails {

	int empId;
	String empName;
	static String companyName;
	
	static {
		System.out.println("I am a static block");
	}

	public void setValues(int id,String eName,String cName) {
		empId=id;
		empName=eName;
		companyName=cName;
	}
	public void printValues() {
		System.out.println(empId+" "+empName+ " "+companyName  );
	}
	
	public static void add(int a,int b) {
		System.out.println(a+b);

	}

	public static void main(String[] args) {
		add(34, 8);// static method
		System.out.println(companyName);// static variable
		
		EmployeeDetails ed = new EmployeeDetails();
		ed.setValues(100, "Subraja", "TestLeaf");
		ed.printValues();
		
		EmployeeDetails ed1 = new EmployeeDetails();
        ed1.setValues(200, "Rahul", "Qeagle");
        ed1.printValues();
        
        ed.printValues();
        ed1.printValues();
	}

}
