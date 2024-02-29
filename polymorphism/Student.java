package polymorphism;

public class Student 
{
	String sname;
	int sid;
	int age;
	Student(String sname,int sid,int age)
	{
		this.sname=sname;
		this.sid=sid;
		this.age=age;
	}
	public String toString()
	{
		return "sname "+sname+"sid "+sid +" age "+age;
	}
	public static void main(String args[])
	{
		Student s=new Student("pranoti ",123,21);
		System.out.println(s);
		Student s1=new Student("gopika",234,22);
		System.out.println(s1);
		Student s2=new Student("abc",345,61);
		System.out.println(s2);
	}

}
