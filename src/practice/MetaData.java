import java.sql.*;

public class MetaData {
	
	Connection conn;
	Statement stmt;
	ResultSetMetaData meta;
	DatabaseMetaData dbmeta;
	ResultSet rs;
	public void ResultSetMetaDataMethod()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
		    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456");
			
			stmt=conn.createStatement();
			
			dbmeta=conn.getMetaData();
			
			rs=stmt.executeQuery("Select * from salesman");
			
			meta=rs.getMetaData();
			
			System.out.println("Printing Result set Meta Data");
			
			System.out.println("Column Count :"+meta.getColumnCount());
			System.out.println("Column Type :"+meta.getColumnType(1));
			System.out.println("Column Table Name :"+meta.getTableName(1));
			
			System.out.println("Printing Database Meta Data");
			
			System.out.println("Db name :"+dbmeta.getDatabaseProductName());
			System.out.println("Db version :"+dbmeta.getDatabaseProductVersion());
			System.out.println("Driver Name :"+dbmeta.getDriverName());
			System.out.println("Driver Version :"+dbmeta.getDriverVersion());
			
			
			conn.close();
			stmt.close();
			rs.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		MetaData md=new MetaData();
		md.ResultSetMetaDataMethod();
	}
	
	
}
