import java.sql.*;
public class  ConnTest
{
	public static void main(String[] args) throws Exception
	{
		oracle.jdbc.driver.OracleDriver driver=new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(driver);
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system","manager");
		if(con==null)
			System.out.println("Connection not established");
		else 
			System.out.println("Connection establised successfully");
	}
}
