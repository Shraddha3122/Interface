interface printable
{
	void print();
}
class Interface2 implements printable
{
	public void print()
	{
		System.out.println("Hello Java");
	}
	public static void main(String args[])
	{
		Interface2 obj=new Interface2();
		obj.print();
	}
}