package day2;

public class Employee {
	int empId;
	String name;
	double salary;
	
	//Explicit constructor
	Employee()
	{
		empId=10;
		name="Ajay";
		salary=10000;
	}
	// right click --> source-->generate-->unselect and generate-->no argument constructor is created
	// right click --> source-->generate-->select and generate-->parameterized constructor is created
	
	
	//Explicit - parameterized constructor
	public Employee(int empId,String name,double salary)
	{
		//should use keyword 'this' to differentiate the instance variable   
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString()
	{
		return "EmpId: "+empId + "\nname: "+name;
	}
	
	void getValues() {
		System.out.println("EmpId: " +empId);
		System.out.println("EmpName: " +name);
		System.out.println("Salary: " +salary);
		
	}

}
