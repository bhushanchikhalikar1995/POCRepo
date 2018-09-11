import java.sql.*;

public class DatabaseConnectivity {

    Connection connection;
	Statement statement;
	ResultSet result;
	
	public  void createConn()
	{
		String url="jdbc:mysql://localhost:3306/test";
		String uname="root";
		String pass="123456";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DriverManager.getConnection(url, uname, pass);
			
			statement = connection.createStatement();
			
			result=statement.executeQuery("Select * from customer");
		
			System.out.println("CustID"+"  "+"CustName"+"  "+"City"+"  "+"Grade");
			while(result.next())
			{
				System.out.println(result.getInt(1)+"   "+result.getString(2)+"   "
			    +result.getString(3)+"   "+result.getInt(4)+"\n");
			}
			
			connection.close();
			statement.close();
			result.close();
	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Succesfully Completed");
	}
	
	
	public static void main(String[] args) {
		
		DatabaseConnectivity dbconn=new DatabaseConnectivity();
		dbconn.createConn();
		
	}
}
