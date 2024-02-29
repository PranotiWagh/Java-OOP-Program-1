package polymorphism;

public class Shadowing 
{
	public static void main(String args[])
	{
		SuperClass s=new SuperClass();
		s.m1();//from superclass hii
		
		SubClass s1=new SubClass();
		s1.m1();//from subclass hello
		
		SuperClass s2=new SubClass();//upcasting
		s2.m1();// from superClass
	}

}
