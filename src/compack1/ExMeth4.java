package compack1;

public class ExMeth4 
{
	void greeting()
	{
		System.out.println("Good Evening !!");
	}
	void display()
	{
		System.out.println("Hello Soumya");
	}
	public static void main(String[] args) 
	{
		ExMeth4 obj=new ExMeth4();
		obj.greeting();
		obj.display();
		System.out.println("------------------");
		new ExMeth4().greeting();
		new ExMeth4().display();
	}
}
