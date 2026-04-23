
 class Manager extends Employee {
	 
	 int teamSize;
	 
	 public Manager(String name, int age, double salary, int teamSize) {
	        super(name, age, salary); // initialize parent fields
	       this.teamSize = teamSize;
	 
	 void displaySalary() {
	        super.displaySalary(); 
	        System.out.println("I manage a team of " +teamSize + " people.");
	    }
	 
	 
		 public static void main(String[] args) {
			 
			 Employee emp = new Employee ("Simon", 27, 25000.00);
				emp.introduce();
				emp.displaySalary();
			 
			 Manager mrg = new Manager ("Leah", 20, 70000.00, 10);
			mrg.introduce();
			mrg.displaySalary();
		 
	 }
	
	 
		    
		        // Array of Person references
		        Person[] people = new Person[3];

		        people[0] = new Person("Alice", 25);
		        people[1] = new Student("Bob", 20, "Rutgers University");
		        people[2] = new Employee("Charlie", 35, 60000.0);

		        // Loop and demonstrate polymorphism
		        for (Person p : people) {
		            p.introduce(); // calls the correct version based on object type
		            System.out.println();
		        }
		    }

	 
