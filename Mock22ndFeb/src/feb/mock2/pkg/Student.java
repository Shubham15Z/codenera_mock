/*
created Student class from Person class to achieve inheritance
Achieved polymophism by overriding displayDetails() method from Person class into Student class
 */

package feb.mock2.pkg;

public class Student extends Person
{
	private int sId;
	private String course;
	
	public Student(String name, int age, int sid, String course)
	{
		super(name, age);
		this.sId = sid;
		this.course = course;
	}
	
	public int getSid()
	{
		return sId;
	}
	
	public String getCourse()
	{
		return course;
	}
	
	public void setSid(int sid)
	{
		this.sId = sid;
	}
	
	public void setCourse(String course)
	{
		this.course = course;
	}
	
	void displayDetails()
	{
		System.out.println("Student Id : "+sId);
		System.out.println("Student name : "+getName());
		System.out.println("Student age : "+getAge());
		System.out.println("Student course : "+course);
	}
}
