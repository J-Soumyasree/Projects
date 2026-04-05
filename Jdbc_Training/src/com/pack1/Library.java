package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Library 
{
	String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@localhost:1521:orcl";
	private String uname="system";
	private String pwd="soumya04";
	
	Scanner sc=new Scanner(System.in);
	/*Connection connect()
	{
		Connection con=null;
		try
		{
			Class.forName(driver);
			con=DriverManager.getConnection(url,uname,pwd);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	*/
	public void add()
	{
		try
		{
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,uname,pwd);
			
			System.out.println("\nenter Book id: ");
			int id=Integer.parseInt(sc.nextLine());
			System.out.println("\nenter Book name: ");
			String name=sc.nextLine();
			System.out.println("\nenter author name: ");
			String author=sc.nextLine();
			System.out.println("\nenter Genere of the book: ");
			String gen=sc.nextLine();
			System.out.println("\nenter Book Cost");
			int cost=Integer.parseInt(sc.nextLine());			
			
			Statement stmt=con.createStatement();
			String sqlqq1="insert into library values("+id+",'"+name+"','"+author+"','"+gen+"',"+cost+")";
			int count=stmt.executeUpdate(sqlqq1);
			if(count==1)
			{				
				System.out.println("Data added");
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
	
	void retrieve()
	{
		try
		{
			String sqlq2="Select * from library";
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,uname,pwd);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sqlq2);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	void delete()
	{
		System.out.println("\nenter book id to delete: ");
		int id=Integer.parseInt(sc.nextLine());
		
		try
		{
			String sqlq3="delete from library where bookid='"+id+"'";
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,uname,pwd);
			Statement stmt=con.createStatement();
			stmt.executeUpdate(sqlq3);
			System.out.println("deleted ");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	void retrieveId()
	{
		try
		{
			String s3="Select * from library";
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,uname,pwd);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(s3);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
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
		Library l=new Library();
		//l.add();
		//l.retrieve();
		//l.delete();
		//l.retrieveId();
	}
}
