package compack1;

public class ExMeth13 
{
	    void meth1() 
	    {
	        System.out.println("Hi");
	    }

	    int meth2(int x, int y) {
	        new ExMeth13().meth1();
	        System.out.println("Hello");
	        return 99;
	    }

	    public static void main(String args[]) {
	    	ExMeth13 obj = new ExMeth13();
	        System.out.println("obj.meth1()");
	        System.out.println("===>"+obj.meth2(2,4));
	    }
	}