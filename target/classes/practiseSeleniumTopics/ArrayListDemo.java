package practiseSeleniumTopics;

import java.util.ArrayList;
import java.util.List;

class Employee{
	
	long id;
	String name;
	int roll;
	public Employee(long id, String name, int roll) {
		//super();
		this.id = id;
		this.name = name;
		this.roll = roll;
	}
	
	
	
	/*public void setId(long ids)
	{
		id=ids;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setRoll(int roll)
	{
		
		this.roll=roll;
	}*/
	
}

public class ArrayListDemo {

	public static void main(String[] args) {
		
		Employee emp1=new Employee(10940817,"vicky",30);
		Employee emp2=new Employee(10887654,"raushan",38);
		List<Employee> ls=new ArrayList<Employee>();
		ls.add(emp1);
		ls.add(emp2);
		for(Employee e:ls)
		{
			System.out.println(e);
		}
		//System.out.println(ls.toString());
		

	}

}
