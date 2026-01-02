package compack1;

public class ExMeth12 {
	    int meth1() {
	        System.out.println("Hi");
	        return 100 - 1;
	    }

	    public static void main(String[] args) {
	        int x = new ExMeth12().meth1() - 1;
	        int y = 2;
	        System.out.println(x + y);
	    }
	}
