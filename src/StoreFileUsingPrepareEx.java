import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 
 */

/**
 * @author a807228
 *
 */
public class StoreFileUsingPrepareEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			//com.mysql.jdbc.Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//3) Create the connection
			//jdbc:mysql://localhost:3306/test
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "ganesh123");
			
			
			PreparedStatement ps=con.prepareStatement("select * from filetable1");  
					              
			/*
			 * File f=new
			 * File("C:\\Users\\a807228\\OneDrive - Atos\\Desktop\\Personal\\25 June 2022\\package.json"
			 * ); FileReader fr=new FileReader(f);
			 * 
			 * ps.setInt(1,101); ps.setCharacterStream(2,fr,(int)f.length()); int
			 * i=ps.executeUpdate(); System.out.println(i+" records affected");
			 */
					              
			ResultSet rs=ps.executeQuery();  
			rs.next();//now on 1st row  
			              
			Clob c=rs.getClob(2);  
			Reader r=c.getCharacterStream();              
			              
			FileWriter fw=new FileWriter("C:\\Users\\a807228\\OneDrive - Atos\\Desktop\\Personal\\25 June 2022\\sample.json");  
			              
			int i;  
			while((i=r.read())!=-1)  
			fw.write((char)i);  
			              
			fw.close();  
			con.close();   
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
