package compack1;

public class ExMeth10 {
	    void meth1(int x, int y, int z) {
	        System.out.println(10);
	        new ExMeth10().meth2("Hi", 100);
	        System.out.println(10 + x);
	        System.out.println(y);
	        System.out.println(10 - z);
	    }

	    void meth2(String s, int num) {
	        System.out.println(s);
	        System.out.println(num - 20);
	        System.out.println(num);
	    }

	    void meth3(char c, int x, String s) {
	        System.out.println(c);
	        new ExMeth10().meth1(5, 10, 6);
	        System.out.println(x / 2);
	        System.out.println(30);
	        System.out.println(s);
	    }

	    public static void main(String args[]) {
	        System.out.println("Start");
	        new ExMeth10().meth3('x', 50, "Hello");
	        System.out.println("End");
	    }
	}
