package string;

public class Example1 
{
	public static void main(String args[])
	{
		String s1="hello";
		String s2="hello";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.hashCode()==s2.hashCode());//true
	}

}

