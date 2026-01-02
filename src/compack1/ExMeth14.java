package compack1;

public class ExMeth14 {
	    int meth1() {
	    	System.out.println("hi");
	        return 10;
	    }

	    int meth2() {
	    	System.out.println("hello");
	        return 20;
	    }
	    public static void main(String[] args) {
	    	ExMeth14 obj = new ExMeth14();
	    	System.out.println(obj.meth1() + obj.meth2()+obj.meth1());
	    }
	}
