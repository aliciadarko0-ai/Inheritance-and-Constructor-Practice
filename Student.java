
	class Student extends Person{
		
		String school; 
		
		 public Student(String name, int age, String school) {
		        super(name, age); // initialize parent fields
		        this.school = school;
		 }
		public void introduce() {
	        super.introduce(); 
	        System.out.println("I attend " + school + ".");
	    }
	
		
			    public static void main(String[] args) {
			        Student stu = new Student("Johnathan", 15, "Highschool");
			        stu.introduce();
			    }
		 
	}
