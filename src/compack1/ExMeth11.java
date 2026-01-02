package compack1;

public class ExMeth11 {
	    public int meth1() {
	        System.out.println("meth1() called");
	        return 100;
	    }

	    public static void main(String[] args) {
	        int i = 1;
	        System.out.println("Start");
	        ExMeth11 aobj = new ExMeth11();
	        int result = aobj.meth1();
	        System.out.println("i: " + i);
	        System.out.println("meth1() is returning: " + result);
	        System.out.println("End");
	    }
	}
