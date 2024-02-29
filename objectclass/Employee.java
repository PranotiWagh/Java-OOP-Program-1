package objectclass;

public class Employee
{
	String ename;
	int eid;
	Employee(String enmae,int eid)
	{
		this.ename=ename;
		this.eid=eid;
	}
	public boolean equals(Object o)
	{
		Employee e=(Employee)o;//downcasting
		return this.ename.equals(e.ename) && this.eid==e.eid;
	}
	public static void main(String args[])
	{
		Employee e1=new Employee("pranoti",123);
		Employee e2=new Employee("pranoti",123);
		Employee e3=new Employee("gopika",234);
		System.out.println(e3.equals(e1));//false
		System.out.println(e1.equals(e2));//true
		System.out.println(e1==e2);
	}
}
