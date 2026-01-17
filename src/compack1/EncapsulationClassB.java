package compack1;
import java.util.Scanner;
public class EncapsulationClassB 
{
	void meth1()
	{
	Scanner sc=new Scanner(System.in);
	EncapsulationClassA obj=new EncapsulationClassA();
	System.out.println("enter employee name: ");
	obj.setempName(sc.nextLine());
	System.out.println("enter empSalary: ");
	obj.setempSal(Integer.parseInt(sc.nextLine()));
	System.out.println("enter emp Experience: ");
	obj.setempExp(Integer.parseInt(sc.nextLine()));
	
	System.out.println("=========================");
	
	System.out.println("employee name: "+ obj.getempName());
	System.out.println("enter employee sal: "+obj.getempSal());
	System.out.println("enter employee Exp: "+obj.getempExp());
	
	}
	
	
	public static void main(String[] args) 
	{
		EncapsulationClassB b=new EncapsulationClassB();
		b.meth1();
	}
}