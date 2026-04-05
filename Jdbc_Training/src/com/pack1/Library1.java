package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Library1 
{
	String driver="oracle.jdbc.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String name="system";
	String pwd="soumya04";
	static Scanner sc=new Scanner(System.in);
	Connection connect()
	{
		Connection con=null;
		try
		{
			Class.forName(driver);
			con=DriverManager.getConnection(url,name,pwd);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	void add()
	{
		try
		{
			
			Connection con=connect();
			System.out.println("\nenter Book id: ");
			int id=Integer.parseInt(sc.nextLine());
			System.out.println("\nenter Book name: ");
			String bname=sc.nextLine();
			System.out.println("\nenter author name: ");
			String author=sc.nextLine();
			System.out.println("\nenter Genere of the book: ");
			String gen=sc.nextLine();
			System.out.println("\nenter Book Cost");
			int cost=Integer.parseInt(sc.nextLine());			
			
			Statement stmt=con.createStatement();
			String s1="insert into library values("+id+",'"+bname+"','"+author+"','"+gen+"',"+cost+")";
			int count=stmt.executeUpdate(s1);
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
			Connection con=connect();
			System.out.print("\nenter book id you want: ");
			int bid=Integer.parseInt(sc.nextLine());
			Statement stmt=con.createStatement();
			String s2="select * from library where bookid="+bid;
			ResultSet rs=stmt.executeQuery(s2);
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
	
	void display()
	{
		try
		{
			String s3="Select * from library";
			Connection con=connect();
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
	
	void delete()
	{
		System.out.println("\nenter book id to delete: ");
		int id=Integer.parseInt(sc.nextLine());
		
		try
		{
			String sqlq3="delete from library where bookid='"+id+"'";
			Connection con=connect();
			Statement stmt=con.createStatement();
			stmt.executeUpdate(sqlq3);
			System.out.println("\ndeleted ");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	void menu()
	{
		System.out.println("connected to database\n\n");
		int n;
		do {

			System.out.println("\n1.add\n2.retreive\n3.display\n4.delete\n5.exit");
			System.out.print("\n\nenter the number of operation: ");
			n=Integer.parseInt(sc.nextLine());
			switch(n)
			{
			case 1:
				add();
				break;
			case 2:
				retrieve();
				break;
			case 3:
				display();
				break;
			case 4:
				delete();
				break;
			case 5:
				System.out.println("***Disconnected from data base***");
				break;
			default:
				System.out.println("Invalid number!!!!");
			}
		}while(n!=5);
	}
	public static void main(String[] args) 
	{
		

		Library1 l=new Library1();
		//l.add();
		//l.retrieve();
		//l.display();
		//l.delete();
		//l.display();
		l.menu();
		
	}

}
