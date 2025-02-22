/*
 Created Abstract class and abstract method to achieve Abstraction
 Added private variable and getter setter methods to achieve encapsulation
 */

package feb.mock2.pkg;

abstract class Person 
{
	private String name;
	private int age;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void steName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	abstract void displayDetails();
}
