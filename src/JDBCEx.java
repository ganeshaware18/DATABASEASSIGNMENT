import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

//1) Import the JDBC API Package

public class JDBCEx {

	public static void main(String[] args) {
	
		//2) Load the JDBC type Driver
		try {
			//com.mysql.jdbc.Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//3) Create the connection
			//jdbc:mysql://localhost:3306/test
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "ganesh123");
			//4) Create the statement object 
			Statement obj=con.createStatement();
			//5)Execute the stement object and get the result set
			ResultSet res=obj.executeQuery("select * from customers1");
			
			//Statement obj2=con.createStatement();
			//5)Execute the stement object and get the result set
			//ResultSet res2=obj2.executeQuery("select * from customers1");
			
			
			ResultSetMetaData rsmd=res.getMetaData();  			  
			System.out.println("Total columns: "+rsmd.getColumnCount());  
			System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
			
			System.out.println("Column Name of 2nd column: "+ rsmd.getColumnName(2));
			
			System.out.println("Column Name of 3rd column: "+ rsmd.getColumnName(3));

			System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  
			
			
			
			//6) Processing the result set
			
			  while(res.next()) { 
			//res.absolute(2); System.out.println(res.getInt(1));
			 // System.out.println(res.getString(2)); System.out.println(res.getString(3));
			 
				  System.out.print(res.getString("customer_id"));
				  System.out.print(" " + res.getString("customer_name"));
			  System.out.print(" " + res.getString("city"));
			  System.out.println();
			  
			  }
			 			
			//getMethod or set methods
			//closing the connection and statement,reseultset
			con.close();
			obj.close();
			res.close();
			
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}

	}

}
