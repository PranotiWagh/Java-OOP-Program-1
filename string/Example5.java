package string;

public class Example5
{
	public static void main(String args[])
	{
		StringBuilder sb1=new StringBuilder("hii");
		StringBuilder sb2=new StringBuilder("seema");
		StringBuilder sb3=new StringBuilder("seema");
		System.out.println(sb1==sb2);//false
		System.out.println(sb1.hashCode()==sb2.hashCode());//false
		System.out.println(sb1.equals(sb2));//false
		System.out.println(sb2.equals(sb3));//false
		System.out.println(sb2.hashCode()==sb3.hashCode());//false
	}

}
