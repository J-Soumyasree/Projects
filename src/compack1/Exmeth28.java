package compack1;
/*
 * Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
frontAgain("edited") ? true
frontAgain("edit") ? false
frontAgain("ed") ? true


public boolean frontAgain(String str)
{


// Write your logic here
 
}
 */
public class Exmeth28 
{
	public boolean frontAgain(String str)
	{
		if(str.substring(0,2).equals(str.substring((str.length()-2))))
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Exmeth28 obj=new Exmeth28();
		boolean res=obj.frontAgain("edited");
		System.out.println(res);
	}
}
