package compack1;

import java.util.Arrays;
/*
 * Given an int array, return a new array with double the length where its 
 * last element is the same as the original array, and all the other elements are 0. 
 * The original array will be length 1 or more.

makeLast([4, 5, 6]) ? [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) ? [0, 0, 0, 2]
makeLast([3]) ? [0, 3]

public int[] makeLast(int[] nums)
{
    // write your logic here
}
 */
public class Exmeth26 
{
	public int[] makeLast(int[] nums)
	{
		int arr[]=new int[nums.length*2];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=0;
		}
		arr[arr.length-1]=nums[nums.length -1];
		return arr;
	}
	public static void main(String[] args) {
		Exmeth26 obj=new Exmeth26();
		int nums[]= {4, 5, 6};
		System.out.println(Arrays.toString(obj.makeLast(nums)));
	}
}
