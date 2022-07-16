import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

public class PreparedStatementEX {


	public static void main(String[] args) {
		
		try {
			//com.mysql.jdbc.Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//3) Create the connection
			//jdbc:mysql://localhost:3306/test
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "ganesh123");
			//Create the prepared statement
			
			  PreparedStatement
			  ps=con.prepareStatement("insert into customers1 values(?,?,?)");
			  
			  
			  ps.setInt(1, 196); 
			  ps.setString(2, "thane"); 
			  ps.setString(3, "igatpuri");
			  System.out.println(ps.execute());
			 
			
			/*
			 * PreparedStatement
			 * ps=con.prepareStatement("insert into imgtable values(?,?)");
			 * ps.setString(1,"cdac");
			 * 
			 * FileInputStream fin=new
			 * FileInputStream("C:\\Users\\a807228\\OneDrive - Atos\\Desktop\\Personal\\25 June 2022\\cdaclogo.jpg"
			 * ); ps.setBinaryStream(2,fin,fin.available()); int i=ps.executeUpdate();
			 * System.out.println(i+" records affected");
			 */
		//	PreparedStatement ps=con.prepareStatement("select * from imgtable");  
			ResultSet rs=ps.executeQuery();  
			//if(rs.next()){//now on 1st row  
			              
			//Blob b=rs.getBlob(2);//2 means 2nd column data  
		//	byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
			              
		//	FileOutputStream fout=new FileOutputStream("C:\\Users\\a807228\\OneDrive - Atos\\Desktop\\Personal\\25 June 2022\\JDBCcdackolkata.jpg");  
			//fout.write(barr);  
			              
		//	fout.close();  
		//	}//end of if  
			System.out.println("ok");  
			
			
		}catch (Exception e) {
		e.printStackTrace();
		}

	}

}
