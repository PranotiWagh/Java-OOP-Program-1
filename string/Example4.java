package string;

public class Example4 
{
	public static void main(String args[])
	{
		StringBuffer sb1=new StringBuffer("hello");
		StringBuffer sb2=new StringBuffer("hello");
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb1==sb2);//false
		System.out.println(sb1.equals(sb2));//false
		System.out.println(sb1.hashCode()==sb2.hashCode());
		
	}

}



