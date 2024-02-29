package string;

public class StringDemo 
{
	public static void main(String args[])
	{
		String s="pranoti";
		System.out.println(s);
		String s1=s.trim();
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.startsWith("p"));
		System.out.println(s1.endsWith("ti"));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.concat("demo"));
		//System.out.println(s1.indent(10));
		System.out.println(s1.charAt(0));
		String s3="java is a programming language";
		System.out.println(s3);
		String s4=s3.replace("java","python");
		System.out.println(s4);
	}

}



