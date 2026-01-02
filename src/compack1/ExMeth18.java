package compack1;

public class ExMeth18 
		{
	    int meth1(int a, int b) {
	        System.out.println(a);
	        System.out.println(a - b);
	        return new ExMeth18().meth4(a - 1, "Hi");
	    }

	    String meth2(int x) {
	        System.out.println(x - new ExMeth18().meth1(200, 199));
	        System.out.println(x);
	        return "Java";
	    }

	    String meth3(int a, int b, String s) {
	        System.out.println(a);
	        System.out.println(a + a);
	        System.out.println(a + b);
	        return s;
	    }

	    int meth4(int a, String s) {
	        System.out.println(a);
	        System.out.println(s);
	        return a + a;
	    }

	    String meth5(String s) {
	        return s;
	    }

	    public static void main(String[] args) {
	        System.out.println(
	            new ExMeth18().meth5(new ExMeth18().meth3(15, 25,new ExMeth18().meth2(500))));
	    }
	}

