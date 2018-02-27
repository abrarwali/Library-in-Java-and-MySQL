package librarycse;
import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/deptt_library?useSSL=false","root","8803718180");
		}catch(Exception e){System.out.println(e);}
		return con;
	}

}
