package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.TreeSet;
import java.util.Scanner;

import java.util.Iterator;

public class Ex1 
{
	private String driver="oracle.jdbc.OracleDriver";
	private String db_url="jdbc:oracle:thin:@localhost:1521:orcl";
	private String db_uname="system";
	private String db_upwd="soumya04";
	String sqlQuery="Select * from employee";
	//String sqlQuery2="insert into employee values('110','Anitha','Gain',42000,'klk')";
	
	Scanner sc=new Scanner(System.in);
	public void getData()
	{
		System.out.println("Reteriving data from Employee Table...");
		try 
		{
			Class.forName(driver);
			Connection con=DriverManager.getConnection(db_url,db_uname,db_upwd);
			Statement stmt1=con.createStatement();
			ResultSet rs=stmt1.executeQuery(sqlQuery);
			TreeSet<Object> t=new TreeSet<Object>();
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
				//break;
				//System.out.println(rs.getString(1));
				//t.add(rs.getString(1));
				
			}
			System.out.println("Before : "+t);
			Iterator<Object> i=t.descendingIterator();
			System.out.print("After: ");
			while(i.hasNext())
				System.out.print(i.next()+" ");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	void insertData()
	{
		System.out.println("Inserting Data into the employee ");
		try
		{
			Class.forName(driver);
			Connection con=DriverManager.getConnection(db_url,db_uname,db_upwd);
			
			
			Scanner s=new Scanner(System.in);
			System.out.print("\nenter employee id : ");
			String id=s.nextLine();
			System.out.print("\nenter first name : ");
			String fname=s.nextLine();
			System.out.print("\nenter last name : ");
			String lname=s.nextLine();
			System.out.print("\nenter employee salary : ");
			int sal=Integer.parseInt(s.nextLine());
			System.out.print("\nenter city : ");
			String city=s.nextLine();
			System.out.println("connection connected");
			String sqlQuery2="insert into employee values('"+id+"','"+fname+"','"+lname+"','"+sal+"','"+city+"')";
			Statement stmt2=con.createStatement();
			int rowCount=stmt2.executeUpdate(sqlQuery2);
			if(rowCount==1)
			{
				System.out.println("Data updated");
				System.out.println("Do u want to view the data: Y/N");
				char choice=sc.nextLine().charAt(0);
				switch(choice)
				{
				case 'Y','y':
					getData();
					break;
				case 'N','n':
					System.out.println("Thank u for upadting the dat!!!");
					break;
				default:
					System.out.println("Data invalid!!!");
				}
			}
			else
				System.out.println("Data not updated");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		Ex1 obj=new Ex1();
		obj.insertData();
	}

}
