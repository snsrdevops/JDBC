import java.sql.*;
public class  ConnTestMySql
{
	public static void main(String[] args) throws Exception 
	{	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///syamala", "root", "root@123");
		System.out.println("con obj class name::"+con.getClass());
		if(con==null)
			System.out.println("Connection was not Established");
		else
			System.out.println("Connection was established Succefully!");
	}
}
