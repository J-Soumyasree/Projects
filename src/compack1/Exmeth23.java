package compack1;
import java.util.Arrays;
/*
 * Given an array of ints length 3, figure out which is larger, the first orlast element 
 * in the array, and set all the other elements to be that value. Return the changed array.
maxEnd3([1, 2, 3]) ? [3, 3, 3]
maxEnd3([11, 5, 9]) ? [11, 11, 11]
maxEnd3([2, 11, 20]) ? [20,20,20]
public int[] maxEnd3(int[] nums)
{
}
 */
import java.util.Arrays;
public class Exmeth23 
{
	public int[] maxEnd3(int[] nums)
	{
		if(nums[0]>nums[nums.length-1])
		{
			for(int i=0;i<nums.length;i++)
				nums[i]=nums[0];
		}
		else
		{
			for(int i=0;i<nums.length;i++)
				nums[i]=nums[nums.length-1];
		}
		return nums;
	}
	public static void main(String[] args) 
	{
		int arr[]= {11, 5, 9};
		new Exmeth23().maxEnd3(arr);
		System.out.println(Arrays.toString(arr));
	}
}
