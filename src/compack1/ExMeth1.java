package compack1;

public class ExMeth1 
{
	public void meth1()
	{
		System.out.println("Hi from meth1()");
		System.out.println(100);
	}
	public void meth2()
	{
		System.out.println("Hello from meth2");
		System.out.println(200);
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		System.out.println("------------");
		ExMeth1 aobj=new ExMeth1();
		aobj.meth1();
		System.out.println("------------");
		aobj.meth2();
		System.out.println("------------");
		System.out.println("Java is awesome");
		System.out.println("End");
	}
}
