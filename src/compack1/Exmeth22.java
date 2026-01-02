package compack1;

/*
 Given an array of ints length 3, return an array with the elements "rotated left" 
 so {1, 2, 3} yields {2, 3, 1}.


rotateLeft3([1, 2, 3]) ? [2, 3, 1]
rotateLeft3([5, 11, 9]) ? [11, 9, 5]
rotateLeft3([7, 0, 0]) ? [0, 0, 7]

public int[] rotateLeft3(int[] nums)
{
    // write your logic here    
}
  */
import java.util.Arrays;
public class Exmeth22 
{
	public int[] rotateLeft3(int[] nums)
	{
		int i=0;
		int first=nums[0];
	    for(;i<nums.length-1;i++)
	    {
	    	nums[i]=nums[i+1];
	    }
	    nums[nums.length-1]=first;
	    return nums;
	}
	public static void main(String[] args) 
	{
		int arr[]= {1, 2, 3};
		Exmeth22 obj=new Exmeth22();
		int[] res=obj.rotateLeft3(arr);
		System.out.println(Arrays.toString(res));
	}
}
