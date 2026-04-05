package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc_pro6 
{
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@localhost:1521:orcl";
	private String name="system";
	private String pwd="soumya04";
	Connection connect()
	{
		Connection con=null;

		try 
		{
			Class.forName(driver);
			con=DriverManager.getConnection(url,name,pwd);
			System.out.println("Connected Created");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	void meth1()
	{
		System.out.println("implementing ScrollableResultSet===>ReadOnly\n");
		Connection con=connect();
		try
		{
			//Statement stmt=con.createStatement(1004,1007);
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs=stmt.executeQuery("select * from employee");
			while(rs.next())
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
		
		System.out.println("----------------------------");
		rs.afterLast();
		//System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
		System.out.println("----------------------------");
		rs.beforeFirst();
		//System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
		System.out.println("----------------------------");
		rs.last();
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
		System.out.println("----------------------------");
		rs.first();
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
		System.out.println("----------------------------");
		rs.afterLast();
		while(rs.previous())
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
		System.out.println("----------------------------");
		rs.absolute(7);
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
		System.out.println("----------------------------");
		rs.absolute(-2);
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
		System.out.println("----------------------------");
		rs.absolute(-4);
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
		rs.absolute(4);
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
		System.out.println("----------------------------");
		rs.absolute(-2);
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
		System.out.println("----------------------------");
		rs.absolute(3);
		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
		System.out.println("----------------------------");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	void meth2()
	{
		System.out.println("implementing ScrollableResultSet===>Update\n");
		Connection con=connect();
		try
		{
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=stmt.executeQuery("Select eid,efname,esal from employee");
			while(rs.next())
			{
				String id=rs.getString(1);
				if(id.equals("103"))
				{
					rs.updateInt(3, 75000);
					rs.updateRow();
				}
			}
			System.out.println("Data updated");
			Statement stmt2=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs2=stmt2.executeQuery("select * from employee");
			rs2.absolute(6);
			System.out.println(rs2.getString(1)+" "+rs2.getString(2)+" "+rs2.getString(3)+" "+rs2.getInt(4)+" "+rs2.getString(5));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Jdbc_pro6 obj=new Jdbc_pro6();
		obj.meth1();
		obj.meth2();
	}
}
