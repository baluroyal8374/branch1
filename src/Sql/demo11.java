package Sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class demo11 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
	Connection cc=	DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306","root","root");
		String s="Select *from college.college";
		
	PreparedStatement s1=cc.prepareStatement(s);
	ResultSet rs=s1.executeQuery();
		while(rs.next()){
			
			int s2=rs.getInt(1);
			System.out.println(s2);
			
		}
		
	}

}
