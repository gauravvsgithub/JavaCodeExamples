interface i1
{
	void display1();
}
interface i2
{
	void display2();
}
class Inter implements i1,i2
{
	public void display1()
	{
		System.out.println("Display for interface 1");
	}
	public void display2()
	{
		System.out.println("Display for interface 2");
}
}
class Interx
{
	public static void main(String[] args) {
		i1 ob1 = new Inter();
		ob1.display1();
		i2 ob2 = new Inter();
		ob2.display2();
	}
}