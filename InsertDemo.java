package errorchecking;

import java.sql.*;

public class InsertDemo {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		//Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
			
			
		}
	}

}
