package com.pack1;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class Jdbc_pro7 
{
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@localhost:1521:orcl";
	private String name="system";
	private String pwd="soumya04";
	
	public void meth1()
	{
		System.out.println("Implementing JdbcRowSer Interface\n");
		try {
			RowSetFactory rsf=RowSetProvider.newFactory();
			JdbcRowSet jrs=rsf.createJdbcRowSet();
			jrs.setUrl(url);
			jrs.setUsername(name);
			jrs.setPassword(pwd);
			jrs.setCommand("select * from employee");
			jrs.execute();
			//jrs.close();//It generates an Exception,JdbcRowSet works only in command mode
			while(jrs.next())
				System.out.println(jrs.getString(1)+" "+jrs.getString(2)+" "+jrs.getInt(4));
			System.out.println("---------------------------");
			jrs.absolute(-2);
				System.out.println(jrs.getString(1)+" "+jrs.getString(2)+" "+jrs.getInt(4));
			System.out.println("---------------------------");
			jrs.afterLast();
			while(jrs.previous())
				System.out.println(jrs.getString(1)+" "+jrs.getString(2)+" "+jrs.getInt(4));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void meth2()
	{
		System.out.println("Implementing CachedRowSet");
		try
		{
			RowSetFactory rsf=RowSetProvider.newFactory();
			CachedRowSet crs=rsf.createCachedRowSet();
			crs.setUrl(url);
			crs.setUsername(name);
			crs.setPassword(pwd);
			crs.setCommand("select eid,efname,esal from employee");
			crs.execute();
			while(crs.next())
			{
				String id=crs.getString(1);
				if(id.equals("102"))
				{
					crs.updateInt("esal",75000);
					crs.updateRow();
					System.out.println("Data Updated!!!");
				}
			}
			//crs.acceptChanges();
			crs.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Jdbc_pro7 obj=new Jdbc_pro7();
		obj.meth1();
		obj.meth2();
	}
}
