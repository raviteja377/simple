package Vtiger.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SapleJdbcExecuteupdate {

	public static void main(String[] args) throws SQLException {
		Driver driverref=new Driver();
		//Step1: register the driver
		DriverManager.registerDriver(driverref);
		//step2:get the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb", "root", "root");
		//step3:issue create statement
		Statement state=con.createStatement();
		//step 4:execute the query
		String query="update custinfo set name='ravi' where id=2;";
		int result=state.executeUpdate(query);
		System.out.println(result);
		if(result==-1) {System.out.println("updated");}
		else{System.out.println("  updated");}
		con.close();}
}
