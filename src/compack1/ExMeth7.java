package compack1;

public class ExMeth7 
{
	void meth1(int x, int y)
	{
		System.out.println("meth() called");
		System.out.println("x: "+x);
		System.out.println("Y: "+y);
		System.out.println("x+y");
		System.out.println(x+y);
		System.out.println("Addition: "+x+y);
		System.out.println("Addition: "+(x+y));
	}
	public static void main(String[] args) 
	{
		ExMeth7 obj=new ExMeth7();
		obj.meth1(1, 99);
	}
}
