package com.pack1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class Jdbc_pro8 
{
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@localhost:1521:orcl";
	private String name="system";
	private String pwd="soumya04";
	Scanner sc=new Scanner(System.in);
	Connection connect()
	{
		Connection con=null;
		try
		{
			Class.forName(driver);
			con=DriverManager.getConnection(url,name,pwd);
			System.out.println("Connection created successfully!!!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	void meth1()
	{
		System.out.println("Implementing Callable Statement====>Procedure");
		Connection con=connect();
		try
		{
			CallableStatement cstmt=con.prepareCall("{call InsertEmpData(?,?,?,?,?)}");
			System.out.println("Enter Employee Id ");
			String e_id=sc.nextLine();
			System.out.println("Enter Employee name ");
			String e_name=sc.nextLine();
			System.out.println("Enter Employee Desg ");
			String e_desg=sc.nextLine();
			System.out.println("Enter Employee Basic Salary ");
			int e_bsal=Integer.parseInt(sc.nextLine());
			float e_tsal=(float)(e_bsal+(0.45*e_bsal)+(0.25*e_bsal));
			cstmt.setString(1,e_id);
			cstmt.setString(2,e_name);
			cstmt.setString(3,e_desg);
			cstmt.setInt(4,e_bsal);
			cstmt.setFloat(5,e_tsal);
			cstmt.execute();
			System.out.println("Data Inserted");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	void meth2()
	{
		System.out.println("implementing Callable Statements========> procedure 2");
		Connection con=connect();
		try
		{
			CallableStatement cstmt=con.prepareCall("{call ReteriveData(?,?,?,?,?)}");
			System.out.println("Enter Employee id ");
			String e_id=sc.nextLine();
			cstmt.setString(1, e_id);
			cstmt.registerOutParameter(2,Types.VARCHAR);
			cstmt.registerOutParameter(3,Types.VARCHAR);
			cstmt.registerOutParameter(4,Types.INTEGER);
			cstmt.registerOutParameter(5,Types.FLOAT);
			cstmt.execute();
			System.out.println("**************Empolyee Data****************");
			System.out.println("employee ID: "+e_id);
			System.out.println("employee Name: "+cstmt.getString(2));
			System.out.println("employee Designation: "+cstmt.getString(3));
			System.out.println("employee Basic sal: "+cstmt.getInt(4));
			System.out.println("employee Total Sal: "+cstmt.getFloat(5));
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	void meth3()
	{
		System.out.println("Implementing Callable Statements ====> functions");
		Connection con =connect();
		try
		{
			CallableStatement cstmt=con.prepareCall("{call ?:=ReteriveTsal(?)}");
			System.out.println("Enter Employee ID");
			String e_id=sc.nextLine();
			cstmt.setString(2, e_id);
			cstmt.registerOutParameter(1, Types.FLOAT);
			cstmt.execute();
			System.out.println("\n************Employee Data*************");
			
			System.out.println("Employee Id:"+e_id);
			System.out.println("Employee Total Salary: "+cstmt.getFloat(1));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		Jdbc_pro8 obj=new Jdbc_pro8();
		//obj.meth1();
		//obj.meth2();
		obj.meth3();
	}
}
