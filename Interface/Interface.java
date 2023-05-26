interface simple
{
	void add();
}
class Interface
{
	int x,y;
	void add(int a,int b)
	{
		x=a;
		y=b;
	}
	void disp()
	{
		System.out.println(x+y);
	}
	public static void main(String args[])
	{
		Interface obj=new Interface();
		obj.add(4,8);
		obj.disp();
	}
}