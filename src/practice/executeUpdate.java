import java.sql.*;

public class executeUpdate {

	Connection conn;
	Statement stmt;
	
	String url="jdbc:mysql://localhost:3306/test";
	String user="root";
	String password="123456";
	String str="ram";
	
	public executeUpdate()
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			 conn=DriverManager.getConnection(url, user, password);
				
			 stmt=conn.createStatement();
			
			 int result=stmt.executeUpdate("delete from salesman where name='ram';");
		
			 System.out.println(result+" row affected");
			 
			 conn.close();
			 stmt.close();
		
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void main(String[] args)
	{
		executeUpdate updade=new executeUpdate();
	}
	
}
