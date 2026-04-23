
class Employee extends Person{
	
	 double salary;
	
	public Employee(String name, int age, double salary) {
        super(name, age); // initialize parent fields
        this.salary = salary;

	}
	
	void displaySalary(){
		System.out.println("My salary is: " + salary);
	}
	
	
	public static void main(String[] args) {
		Employee emp = new Employee ("Simon", 27, 25000.00);
		
		emp.introduce();
		emp.displaySalary();
		}
	
	}


