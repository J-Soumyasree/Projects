package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Jdbc_pro5 
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
			System.out.println("connection created");
		}
		catch(Exception e)
		{
			System.out.println("failed");
			e.printStackTrace();
		}
		return con;
	}
	void patient_operations()
	{
		Connection con=connect();
		try
		{
			PreparedStatement pstmt1=con.prepareStatement("insert into patient values(?,?,?,?)");
			PreparedStatement pstmt2=con.prepareStatement("Select * from patient");
			PreparedStatement pstmt3=con.prepareStatement("Select * from patient where PID=?");
			PreparedStatement pstmt4=con.prepareStatement("Update patient set age=? where pid=?");
			PreparedStatement pstmt5=con.prepareStatement("delete from patient where pid=?");
			while(true)
			{
				System.out.println("\nWelcome to patient portal\n");
				System.out.println("Please choose your option");
				System.out.println("1. Add Patient\n2. View all patient\n3. Retreive Patient data\n4. Upadate Patient Data\n5. Delete Patient Data\n6. Exit\n");
				int choice=Integer.parseInt(sc.nextLine());
				switch(choice)
				{
				case 1:
					System.out.println("Add Patient Data");
					System.out.println("enter Patient id: ");
					String Pat_id=sc.nextLine();
					System.out.println("enter Patient name: ");
					String Pat_name=sc.nextLine();
					System.out.println("enter Patient age: ");
					int Pat_age=Integer.parseInt(sc.nextLine());
					System.out.println("enter Patient contact: ");
					long Pat_contact=Long.parseLong(sc.nextLine());
					
					pstmt1.setString(1, Pat_id);
					pstmt1.setString(2, Pat_name);
					pstmt1.setInt(3,Pat_age);
					pstmt1.setLong(4, Pat_contact);
					
					int row_Count=pstmt1.executeUpdate();
					if(row_Count>0)
					{
						System.out.println("Data inserted ");
					}
					else
					{
						System.out.println("Data not inserted ");
					}
					break;
					
				case 2:
					System.out.println("View all Patients Data");
					ResultSet rs1=pstmt2.executeQuery();
					while(rs1.next())
					{
						System.out.println(rs1.getString(1)+" "+rs1.getString(2)+" "+rs1.getInt(3)+" "+rs1.getLong(4));
					}
					break;
				case 3:
					System.out.println("Reteive Patient Data basing on 'PID'");
					System.out.println("enter id of patient to view: ");
					String pid=sc.nextLine();
					pstmt3.setString(1, pid);
					ResultSet rs2=pstmt3.executeQuery();
					if(rs2.next())
					{
						System.out.println(rs2.getString(1)+" "+rs2.getString(2)+" "+rs2.getInt(3)+" "+rs2.getLong(4));
					}
					else
					{
						System.out.println("there is no record of patient with your entered pid**");
					}
					break;
				case 4:
					System.out.println("Update Patient Data basing on 'PID'");
					System.out.println("enter patient pid: ");
					String p_pid=sc.nextLine();
					System.out.println("enter age of the patient to update: ");
					int p_age=Integer.parseInt(sc.nextLine());
					pstmt4.setInt(1,p_age);
					pstmt4.setString(2,p_pid);
					int count=pstmt4.executeUpdate();
					if(count>0)
					{
						System.out.println("data updated");
					}
					else 
					{
						System.out.println("no patient record available with your patient id ");
					}
					break;
				case 5:
					System.out.println("Delete Patient Data basing on 'PID'");
					System.out.println("enter patient pid to delete: ");
					String p_id=sc.nextLine();
					pstmt5.setString(1, p_id);
					int count2=pstmt5.executeUpdate();
					if(count2>0)
					{
						System.out.println("data deleted");
					}
					else 
					{
						System.out.println("no patient record available with your patient id ");
					}
					
					break;
				case 6:
					System.out.println("Thank you for visiting our Patient portal");
					System.out.println("See you soon!!");
					System.exit(0);
					break;
				}
			
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		Jdbc_pro5 obj=new Jdbc_pro5();
		obj.patient_operations();
	}
}
