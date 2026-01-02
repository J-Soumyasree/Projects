package compack1;

import java.util.Arrays;

/*
 * Given 2 int arrays, a and b, each length 3, return a new array length 2 
 * containing their middle elements.


middleWay([1, 2, 3], [4, 5, 6]) ? [2, 5]
middleWay([C], [3, 8, 0]) ? [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) ? [2, 4]

public int[] middleWay(int[] a, int[] b)
{
    // write your logic here
}
 */
public class Exmeth24 
{
	int[] c= new int[2];
	public int[] middleWay(int[] a, int[] b)
	{
		c[0]=a[(a.length/2)];
		c[1]=b[(b.length/2)];
		return c;
	}
	public static void main(String[] args) {

		int a1[]= {5, 2, 9};
		int b1[]= {1, 4, 5};
		Exmeth24 obj=new Exmeth24();
		System.out.println(Arrays.toString(obj.middleWay(a1,b1)));
	}
}
