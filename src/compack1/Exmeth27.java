package compack1;
/*Given an array of integers, return true if one of the first '4' elements in 
 * the array is "9".
Hint: The array length may be less than '4'.
arr{10,20,3,9,5000} ---> true
arr{10,20,3,85,5000} ---> false
arr{10,20,3,50,9} ---> false
 */
public class Exmeth27 
{
	boolean Booleanmeth(int num[]) 
	{
		if(num.length<4)
		{
			for(int i=0;i<num.length;i++)
			{
				if(num[i]==9)
				{
					return true;
				}
			}
		}
		else if(num.length>=4)
		{
			for(int i=0;i<4;i++)
			{
				if(num[i]==9)
				{
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{
		int arr[]= {10,20,9};
		Exmeth27 obj=new Exmeth27();
		System.out.println(obj.Booleanmeth(arr));
	}

}
