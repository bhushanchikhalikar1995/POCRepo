import java.sql.Connection;
import java.sql.*;

public class CallableStmt {

	Connection conn;
	CallableStatement cstmt;
	
	public CallableStmt() {
		// TODO Auto-generated constructor stub
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456");
			
			 cstmt=conn.prepareCall("{call pro()}");
			 
			 ResultSet rs=cstmt.executeQuery();
			 
			 while(rs.next())
			 {
				 System.out.println(rs.getString(2));
			 }
				
			conn.close();
			
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
	
		CallableStmt cstmt=new CallableStmt();
	}
	
}
