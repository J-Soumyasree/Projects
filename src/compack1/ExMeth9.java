package compack1;

public class ExMeth9 {
	    void meth1(int a, String s) 
	    {
	        System.out.println(a + a);
	        System.out.println("a");
	        System.out.println('a');
	        System.out.println(a);
	        System.out.println("s: " + s);
	    }

	    void meth2(int a, int b) {
	        System.out.println(a * a);
	        System.out.println(b);
	        new ExMeth9().meth4("Java is awesome");
	        new ExMeth9().meth3('A', 100);
	        System.out.println(a - b);
	    }

	    void meth3(char c, int a) {
	        System.out.println(c);
	        System.out.println('C');
	        System.out.println(a);
	    }

	    void meth4(String s) {
	    	new ExMeth9().meth1(10, "Hello World");
	        System.out.println(s);
	    }

	    public static void main(String[] args) {
	        System.out.println("Start");
	        
	        new ExMeth9().meth2(5, 10);
	        System.out.println("End");
	    }
	}
