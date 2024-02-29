package objectclass;

public class Pen 
{
	String name;
	String color;
	double price;
	
	Pen(String name,String color,double price)
	{
		this.name=name;
		this.color=color;
		this.price=price;
	}
	
	public int hashCode()
	{
		return Objects.hash(name,color,price);
	}
	public static void main(String[] args)
	{
		Pen p1=new Pen("ABC","red",10.54);
		Pen p2=new Pen("ABC","red",10.54);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
				

	}

}
