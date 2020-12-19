class Parent
{
	int a = 15, b=30;
	void display()
	{
		int c = a+b;
		System.out.println("The sum is = "+c);
	}
}

class child extends Parent
{
	void display()
	{
		super.display();
		int d=a*b;
		System.out.println("The product is "+d);
	}
}
class MOverrid
{
	public static void main(String[] args) {
		child ob = new child();
		ob.display();
	}
}
//can i access variable of a grandparent using super?
//The ans is no but using super in its parent and then again super in it