package compack1;

public class ExMeth5 {
	void meth1()
	{
		int x=10;
		System.out.println("x");
		System.out.println("x: "+x);
		System.out.println("Add: "+(x+90));
		System.out.println("Add: "+x+90);
		System.out.println(x+90);
	}
	public static void main(String[] args) {
		System.out.println("Start");
		ExMeth5 obj=new ExMeth5();
		obj.meth1();
		System.out.println("End");
	}
}
