import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Image {

	Connection conn;
	PreparedStatement stmt;
	
	public void storeImgInDb()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456");
				
			 stmt=conn.prepareStatement("insert into imagetable values(?,?);");
			
			 stmt.setString(1, "bhushan");
			 
			 
			
			 FileInputStream fis=new FileInputStream("bhushan2.jpg");
			 stmt.setBinaryStream(2,fis);
			 
			 
			 stmt.executeUpdate();
			 
			 
			 conn.close();
			 stmt.close();
		
			 System.out.println("Sucessfully Inserted");
	
			 
			 
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	
	public void RetrieveImgFromDb()
	{
		try
		{
		    	Class.forName("com.mysql.jdbc.Driver");
			
			  conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456");
			
			  Statement stmt=conn.createStatement();
			  
			  ResultSet rs=stmt.executeQuery("Select * from imagetable");
	
			  rs.next();
			  Blob b=rs.getBlob(2);
			  byte arr[]=b.getBytes(1, (int) b.length());
			  
			  FileOutputStream fos=new FileOutputStream("eddard_stark.jpg");
			  fos.write(arr);
			  
			  System.out.println("Successfully Retreived");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		Image img=new Image();
		img.storeImgInDb();
		img.RetrieveImgFromDb();
	}
}
