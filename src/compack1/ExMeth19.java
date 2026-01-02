package compack1;

public class ExMeth19 
{
	    public String testMethod1() {
	        System.out.println(35);
	        return new ExMeth19().testMethod3(new ExMeth19().testMethod2()) 
	                + new ExMeth19().testMethod4("Here");
	    }

	    public int testMethod2() {
	        System.out.println(25);
	        return 25 + 5;
	    }

	    public String testMethod3(int a) {
	        System.out.println(15);
	        return "is";
	    }

	    public String testMethod4(String s) {
	        System.out.println(45);
	        return "awesome";
	    }

	    public static void main(String[] args) {
	    	ExMeth19 t = new ExMeth19();
	        System.out.println("Java " + t.testMethod1());
	    }
	}

