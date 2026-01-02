package compack1;

public class ExMeth3 
{
	void meth1()
	{
		System.out.println("Java is awesome !!!");
	}
	public static void main(String[] args) 
	{
		ExMeth3 obj=new ExMeth3();
		obj.meth1();   //1nd way of calling a method
		System.out.println("----------");
		new ExMeth3().meth1();  //2nd way of calling a method
	}
}
