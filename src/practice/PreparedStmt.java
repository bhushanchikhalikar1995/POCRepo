import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStmt {

	Connection conn;
	PreparedStatement stmt;
	
	String url="jdbc:mysql://localhost:3306/test";
	String user="root";
	String password="123456";
	
	public PreparedStmt()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			 conn=DriverManager.getConnection(url, user, password);
				
			 stmt=conn.prepareStatement("insert into salesman values(?,?,?,?)");
			
			 stmt.setInt(1, 12);
			 stmt.setString(2, "kartik");
			 stmt.setString(3, "Pune");
			 stmt.setDouble(4, 0.111);
			 
			 stmt.executeUpdate();
			 
			 
			 conn.close();
			 stmt.close();
		
			 System.out.println("Execute Successfully");
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PreparedStmt stmt=new PreparedStmt();
	}

}
