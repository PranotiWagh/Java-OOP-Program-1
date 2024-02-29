package string;

public class Example2 
{
	public static void main(String args[])
	{
		String s1="QSP";
		String s2=new String("QSP");
		String s3=new String("JSP");
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.hashCode()==s2.hashCode());//true
		
	}

}
