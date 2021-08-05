import java.sql.*;
public class ConnTest1 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "manager");
		if(con==null)
		System.out.println("Connetction is not established");
		else
		System.out.println("Connection is Established Successfull");
		}
}