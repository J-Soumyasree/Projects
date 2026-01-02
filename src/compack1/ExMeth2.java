package compack1;

public class ExMeth2 
{
	void meth1()
	{
		System.out.println("Hi from meth1()");
	}
	void meth2()
	{
		ExMeth2 obj=new ExMeth2();
		obj.meth1();
		System.out.println("Hello from Meth2()");
	}
	public static void main(String[] args) 
	{
		System.out.println("start");
		ExMeth2 obj=new ExMeth2();
		obj.meth2();
		System.out.println("End");
	}
}
