/*
 Achieved Upcasting or dynamic method dispatch by referencing parent class to created base class object
 To achieve runtime polymorphism.
 */
package feb.mock2.pkg;

public class Main 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student("Rahul Sharma", 22, 70101, "Python");
		s1.displayDetails();
		System.out.println("-----------------------------------------");
		Person s2 = new Student("Ajay Roy", 25, 50301, "Java"); // Upcasting
		s2.displayDetails();
	}
}
