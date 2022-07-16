import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//1) Import the JDBC API Package

public class JDBCEX2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		//2) Load the JDBC type Driver
		try {
			//com.mysql.jdbc.Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//3) Create the connection
			//jdbc:mysql://localhost:3306/test
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "ganesh123");
			//4) Create the statement object 
			
			
			
			//Statement obj2=con.createStatement();
			//5)Execute the stement object and get the result set
			//ResultSet res2=obj2.executeQuery("select * from customers1");
			
			//6) Processing the result set
			/*
			 * while(res.next()) {
			 * 
			 * 
			 * 
			 * }
			 */
			
			DatabaseMetaData dbmd=con.getMetaData();  
			  
			System.out.println("Driver Name: "+dbmd.getDriverName());  
			System.out.println("Driver Version: "+dbmd.getDriverVersion());  
			System.out.println("UserName: "+dbmd.getUserName());  
			System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
			System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
			
			//getMethod or set methods
			//closing the connection and statement,reseultset
			con.close();
		
		
			
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}

	}

}
