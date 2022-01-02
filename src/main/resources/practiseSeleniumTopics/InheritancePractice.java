package practiseSeleniumTopics;

/* 
 * Child class object up cast to super class reference. Using super class reference , sub class object can not use methods
of sub class despite of being object of that class. Up casting restricts access or visibility of methods downwards 
SuperClass1 superClass1 = new SubClass1();
superClass1.super_print();
superClass1.super_show();

To access sub class methods, super class reference needs to be downcast to sub class reference. Note here we can down cast
to a up cast reference only.
SubClass1 subClass1 = (SubClass1)superClass1;
subClass1.sub_print();
subClass1.sub_show();*/


class Parent{
	
	public void showP()
	{
		System.out.println("Parent class show");
	}
	
}

public class InheritancePractice extends Parent {
	
	public void showB()
	{
		System.out.println("Child class show");
	}

	public static void main(String[] args) {
		
		Parent p=new InheritancePractice();
		p.showP();
		InheritancePractice ip=(InheritancePractice)p;
		ip.showB();
				

	}

}
