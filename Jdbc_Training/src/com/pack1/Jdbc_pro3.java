/*1) Insert the data in to emp table *
  2) Reterive all the data from emp table *
  3) Reterive the data basing on empId *
  4) Update empSal basing on empID *  
  5) Delete empSal basing on empID *
*/
package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc_pro3 
{
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@localhost:1521:orcl";
	private String name="system";
	private String pwd="soumya04";
	String sqlq1="Select * from employee";
	//String sqlq2="insert into employee values('106','James','Scott',70000,'elr')";
	
	Scanner sc=new Scanner(System.in);
	public void insert()
	{
		System.out.println("\n\ninserting data...");
		
		try
		{
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,name,pwd);
			
			System.out.println("\n enter emp id: ");
			String id=sc.nextLine();
			System.out.println("\n enter emp first name: ");
			String fname=sc.nextLine();
			System.out.println("\n enter emp last name: ");
			String lname=sc.nextLine();
			System.out.println("\n enter emp salary: ");
			int sal=Integer.parseInt(sc.nextLine());
			System.out.println("\n enter emp city: ");
			String city=sc.nextLine();
			
			System.out.println("successfully connected");
			String sqlqq2="insert into employee values('"+id+"','"+fname+"','"+lname+"',"+sal+",'"+city+"')";
			
			Statement stmt=con.createStatement();
			//stmt.executeUpdate(sqlq2);
			int count=stmt.executeUpdate(sqlqq2);
			if(count==1)
			{
				System.out.println("Data updated");
			}
			else
			{
				System.out.println("data not updated!!!");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void getdata()
	{
		System.out.println("\n\nConnected to data base");
		try
		{
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,name,pwd);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sqlq1);
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void getdataID()
	{
		System.out.println("enter eid to get employee details: ");
		String eid=sc.nextLine();
		try
		{
			String sqlq3="select * from employee where eid='"+eid+"'";
			String sqlq4="update sal=70000 from employee where eid='"+eid+"'";
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,name,pwd);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sqlq3);
			while(rs.next())
			{
				System.out.print(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
			}
			
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void updatesal()
	{
		System.out.println("enter eid to update  employee sal: ");
		String eid1=sc.nextLine();
		System.out.println("enter salary to update  employee sal: ");
		int sal1=Integer.parseInt(sc.nextLine());
		
		try
		{
			
			String sqlq4="update employee set esal="+sal1+" where eid='"+eid1+"'";
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,name,pwd);
			Statement stmt=con.createStatement();
			stmt.executeUpdate(sqlq4);
			getdata();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deletesal()
	{
		System.out.println("enter eid to delete  employee sal: ");
		String eid=sc.nextLine();
		
		try
		{
			String sqlq5="update employee set esal=NULL where eid='"+eid+"'";
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,name,pwd);
			Statement stmt=con.createStatement();
			stmt.executeUpdate(sqlq5);
			getdata();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		Jdbc_pro3 obj=new Jdbc_pro3();
		obj.getdata();
		//obj.insert();
		//obj.getdata();
		//obj.getdataID();
		//obj.updatesal();
		//obj.deletesal();
	}
}
