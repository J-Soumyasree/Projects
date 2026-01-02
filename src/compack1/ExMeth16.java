package compack1;

public class ExMeth16 {
	int meth1(int a, int b, char c) 
	{
	        System.out.println(c);
	        int result = new ExMeth16().meth2("Java", 100, 'y');
	        return 10 + a + result;
	    }

	    int meth2(String s, int a, char c) {
	        System.out.println(s);
	        System.out.println(c);
	        return 20;
	    }

	    public static void main(String[] args) {
	        System.out.println(new ExMeth16().meth1(10, 20, 'x'));
	    }
	}

