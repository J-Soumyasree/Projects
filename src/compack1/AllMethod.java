package compack1;

public class AllMethod {
	static int c=25;
	int d=30;
	int meth1(int a,int b)
	{
		System.out.println("\nFrom method 1:");
		int c=a++ + --b;
		System.out.println("value of c: "+c);
		return c+b;
	}
	
	static 
	{
		System.out.println("Start");
	}
	static int meth2(int age)
	{
		System.out.println("\nFrom method 2:");
		if(age>=18 & age<=101)
		{
			System.out.println("eligible to vote");
		}
		else 
		{
			System.out.println("not eligible");
		}
		return 60;
	}
	void meth3()
	{
		System.out.println("\nFrom method 3: ");
		AllMethod obj2=new AllMethod();
		obj2.meth4();
		
	}
	void meth4()
	{
		System.out.println("\nFrom method 4: ");
		System.out.println("implicit and explicit");
		int n=300;
		byte m=100;
		int p=m;
		byte q=(byte)n;
		System.out.println("implicit value: "+p);
		System.out.println("explicit value: "+q);
		System.out.println("\nAuto-boxing and auto-unboxing");
		Integer d=n;
		System.out.println("Auto-Boxing value d: "+d);
		Double i=20.0;
		double j=i.doubleValue();
		System.out.println("Auto-unboxing value i: "+j);
		
	}
	public AllMethod()
	{
		System.out.println("From default constructor");
	}
	AllMethod(int k)
	{
		System.out.println("From parameterized contructor");
		System.out.println("k:"+k);
	}
	protected void finalize()
	{
		System.out.println("Garbage collected");
	}
	public static void main(String[] args) 
	{
		AllMethod obj2=new AllMethod(10);
		System.out.println("\nreturn value from meth1: "+obj2.meth1(10,20));
		System.out.println("static value of c: "+c);
		System.out.println(meth2(21));
		AllMethod obj1=new AllMethod();
		obj1.meth3();
		System.out.println("\nobj1: "+obj1.hashCode());
		System.out.println("obj1: "+obj2.hashCode());
		System.out.println(obj1.equals(obj2));
		System.out.println("Class of obj1: "+obj1.getClass());
		System.out.println("toString of obj2: "+obj2.toString());
		meth2(120);
		obj2=null;
		System.gc();
	}
}
