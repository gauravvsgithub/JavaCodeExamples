abstract class Parent
{
	abstract void display1(); // abstract method

	void display2()// normal method
	{
		System.out.println("Testing for a Abstract class");
	}
}
class child extends Parent
{
	void display1()
	{
		System.out.println("This body is provided by child class");
	}
	void display3()
	{
		System.out.println("Child");
	}
}

class abst_testing
{
	public static void main(String[] args) {
		child t = new child();
		t.display1();
		t.display2();
		t.display3();
	}
}