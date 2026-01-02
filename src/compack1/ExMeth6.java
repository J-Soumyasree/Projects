package compack1;

public class ExMeth6 {
	void meth1()
	{
		ExMeth6 obj=new ExMeth6();
		obj.meth5();
		int a=10;
		System.out.println(10);
		System.out.println(54+a);
		
	}
	void meth2()
	{
		int a=20;
		System.out.println(78-a);
	}
	void meth3()
	{
		int a=30;
		ExMeth6 obj2=new ExMeth6();
		System.out.println(89+1);
		obj2.meth1();
		System.out.println(10);
	}
	void meth4()
	{
		int a=10;
		System.out.println(89);
		System.out.println(85);
		System.out.println(84);
	}
	void meth5()
	{
		System.out.println(77);
		ExMeth6 obj=new ExMeth6();
		obj.meth2();
		System.out.println(99);
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		ExMeth6 obj=new ExMeth6();
		obj.meth3();
		System.out.println("End");
	}
}




