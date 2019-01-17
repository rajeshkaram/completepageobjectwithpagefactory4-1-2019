package com.orion.automation.Database;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class Databasetest {

	@Test
	public void selectDbdata() throws ClassNotFoundException, SQLException {
		
		String query="Select * from product order by productid asc";
				Database database=new Database();
				
				ResultSet data=database.getData(query);
				System.out.println(data);
				while(data.next()) {
					
					System.out.println(data.getString(1)+" "+data.getString(2)+" "+data.getString(3));
				}
		
		
	}
	//@Test
	public void insertDbdata() throws ClassNotFoundException, SQLException {
		
	String query="insert into product values(001,'Tcs','6000')";
				Database database=new Database();
		database.insertData(query);
	}
	//@Test
	public void updateDbdata() throws ClassNotFoundException, SQLException {
		
		String query="update product set productname='tcs' where productid=001";
					Database database=new Database();
			   database.updateData(query);
		}
	
	//@Test
	public void deleteDbdata() throws ClassNotFoundException, SQLException {
		
		String query="delete from product where productid=001";
				Database database=new Database();
		   database.deleteData(query);
				
	}
}