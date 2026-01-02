package compack1;

public class ExMeth15 
{
	    void meth1() 
	    {
	        System.out.println(10);
	        System.out.println(64);
	        System.out.println("End");
	    }

	    int meth2(int a, int b, int c) {
	        System.out.println(a);
	        ExMeth15 bobj = new ExMeth15();
	        String s = bobj.meth5(100, "Java is awesome");
	        System.out.println(s);
	        return a - b;
	    }

	    String meth3(String s, int b, int d) {
	        System.out.println(b + d);
	        return s;
	    }

	    int meth4(int c, int k) {
	        System.out.println(k);
	        ExMeth15 bobj = new ExMeth15();
	        int result = bobj.meth2(50, 50, 50);
	        System.out.println(result);
	        return k + 10;
	    }

	    String meth5(int a, String l) {
	        System.out.println(a + a);
	        ExMeth15 bobj = new ExMeth15();
	        String s = bobj.meth3("Hi", 15, 10);
	        System.out.println(s);
	        return l;
	    }

	    public static void main(String[] args) {
	    	ExMeth15 bobj = new ExMeth15();
	        System.out.println("START");
	        int result = bobj.meth4(20, 10);
	        System.out.println(result);
	        bobj.meth1();
	    }
	}
