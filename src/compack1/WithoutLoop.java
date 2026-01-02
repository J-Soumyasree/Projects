package compack1;

public class WithoutLoop {
	int meth1(int x,int y)
	{
		if(x>y)
		{
			return 0;
		}
		System.out.println(x);
		return new WithoutLoop().meth1(x+1,100);
	}
	public static void main(String[] args) 
	{
		new WithoutLoop().meth1(1,100);
	}
}
