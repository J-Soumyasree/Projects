package compack1;
import java.util.Scanner;
public class SClass 
{
	static Scanner s=new Scanner(System.in);
	
	void meth1(String ename, int id,int sal,String address)
	{
		System.out.println("Details entered by User ");
		System.out.println("EmpName: " +ename);
		System.out.println("Empid: " +id);
		System.out.println("EmpSal: " +sal);
		System.out.println("EmpAddress " +address);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter EmpName: ");
		String empName=s.nextLine();
		System.out.println("Enter Empid: ");
		int empid=Integer.parseInt(s.nextLine());
		System.out.println("Enter Empsal: ");
		int empSal=Integer.parseInt(s.nextLine());
		System.out.print("Enter EmpAddress: ");
		String empAddress=s.nextLine();
		SClass obj=new SClass();
		obj.meth1(empName,empid,empSal,empAddress);
	}
}
