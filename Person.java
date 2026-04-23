
public class Person {

	 String name;
	 int age;
	
	 public Person(String name, int age) {
		 this.name = name;
		 this.age = age;
	 }
	
	 public void introduce(){
		System.out.println("Hi, my name is " + name + "and I am "+ age + "years old.");
		}
	
	 public static void main(String[] args) {
		Person person1 = new Person("Jimmy",19);
		Person person2 = new Person("Samantha",22);
	}
}
