package compack1;

public class ClassC {
	    int c;
	    static int e;

	    ClassC() {
	        System.out.println(++c);
	        System.out.println(++e);
	    }

	    public static void main(String[] args) {
	        int a = 34;
	        int b = 21;

	        new ClassC().c-= a++ + ++b;        // Line 1
	        int d = --a + --b + new ClassC().c--; // Line 2
	        e = a + +b + +new ClassC().c + d--;   // Line 3
	        int f = -a + b-- + -new ClassC().c - d++; // Line 4
	        int sum = a + b + new ClassC().c + d + e + f; // Line 5
	        System.out.println("sum=" + sum);
	    }
	}
