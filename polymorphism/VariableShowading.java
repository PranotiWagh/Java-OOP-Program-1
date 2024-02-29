package polymorphism;

public class VariableShowading 
{
	public static void main(String args[])
	{
		A a=new A();
		System.out.println(a.i);//10
		
		B b=new B();
		System.out.println(b.i);//20
		
		A a1=new B();//upcasting
		System.out.println(a1.i);//20
	}

}
