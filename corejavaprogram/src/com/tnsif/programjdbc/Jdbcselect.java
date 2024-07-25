package com.tnsif.programjdbc;

import java.sql.*;
import javax.sql.*;//step 1import packages
public class Jdbcselect {
	//step 2 load and register the driver
	//step 3 establish the connection
	public static void main(String[] args) {
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriindu","root","navya@123");
			Statement st=conn.createStatement();
			String strselect="select booktitle,price,qty from student";
			ResultSet rst=st.executeQuery(strselect);
			System.out.println("the record are");
			int rowcount=0;
			while(rst.next()) {
				String booktitle=rst.getString("booktitle");
				int price=rst.getInt("price");
				int qty=rst.getInt("qty");
				System.out.println(booktitle+" "+price+" "+qty);
				++rowcount;

			}
		}
	
catch(SQLException e) {
	e.printStackTrace();
	}
	}
}
