package Vtiger.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SampleJDBCExecutequery {

	public static void main(String[] args) throws SQLException {
		Driver driverref=new Driver();
		//Step1:register the driver
		DriverManager.registerDriver(driverref);
		//step2:get the connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb", "root", "root");
		//step 3:issue create statement
		Statement state=con.createStatement();
		//step 4:execute the query-- use table name
		String query="select * from custinfo;";
ResultSet result=state.executeQuery(query);
//step 5:close the database
while(result.next()) {
System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3));
}
	}

}

 
 