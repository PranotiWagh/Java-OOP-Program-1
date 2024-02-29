package polymorphism;

public class Book 
{
	String bname;
	int bid;
	double bprice;
	String author;
	Book(String bname,int bid,double bprice)
	{
		this.bname=bname;
		this.bid=bid;
		this.bprice=bprice;
	}
	public boolean equals(Object o)
	{
		Book b=(Book)o; //downcasting
		return (this.bname.equals(b.bname) && this.bid==b.bid) && this.bprice==b.bprice;
	}
	public static void main(String args[])
	{
		Book b1=new Book("Java",12,2224.4);
		Book b2=new Book("Java",12,234.4);
		Book b3=new Book("Java",12,234.4);
		System.out.println(b1.equals(b3));//false
		System.out.println(b1.equals(b2));//false
		System.out.println(b2.equals(b3));//true
	}

}
