package compack1;

public class ExMeth8 {
	void meth1(int i, String s, char c)
	{
		System.out.println(s);
		System.out.println('s');
		System.out.println("s");
		System.out.println('x');
		System.out.println(i);
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		ExMeth8 obj=new ExMeth8();
		obj.meth1(10,"j",'X');
	}
}
