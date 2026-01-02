package compack1;

import java.util.Arrays;

/*
 * Given an array of ints, return a new array length 2 containing the first and 
 * last elements from the original array. The original array will be length 1 or more.


makeEnds([1, 2, 3]) ? [1, 3]
makeEnds([1, 2, 3, 4]) ? [1, 4]
makeEnds([7, 4, 6, 2]) ? [7, 2]


public int[] makeEnds(int[] nums)
{
     // write your logic here
}
 */
public class Exmeth25 {
	public int[] makeEnds(int[] nums)
	{
		int arr[]=new int[2];
		if(nums.length>1)
		{
			arr[0]=nums[0];
			arr[1]=nums[nums.length-1];
		}else
		{
			arr[0]=nums[0];
		}
		return arr;
	}
	public static void main(String[] args) {
		Exmeth25 obj=new Exmeth25();
		int nums[]= {7, 4, 6, 2};
		System.out.println(Arrays.toString(obj.makeEnds(nums)));
	}
}
