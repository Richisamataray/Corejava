public class Employee {
	
	int empNumber;
	String name;
	float exp;
	
	public Employee(int empNumber, String name, float exp) {
		super();
		this.empNumber = empNumber;
		this.name = name;
		
		if(exp > 2.5 && exp < 3.6) {
		this.exp = exp;
		}
		else {

			throw new IllegalArgumentException("Not a valid input");
		}
	
	}

	
}
