package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc_pro2 
{
	private String driver="oracle.jdbc.OracleDriver";
	private String db_url="jdbc:oracle:thin:@localhost:1521:orcl";
	private String db_uname="system";
	private String db_upwd="soumya04";
	String sqlQuery="Select * from employee";
	public void getData()
	{
		System.out.println("Connecting ...");
		try 
		{
			Class.forName(driver);
			Connection con=DriverManager.getConnection(db_url,db_uname,db_upwd);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sqlQuery);
			
			while(rs.next())
			{
				//System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
				//break;
				//System.out.println(rs.getString(1));
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) 
	{
		new Jdbc_pro2().getData();
	}

}
