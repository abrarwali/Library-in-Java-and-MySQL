package librarycse;

import java.sql.*;

public class LibrarianDB {
 public static int save (String ID,String Name,String Password){
	int status = 0;
	 try{
		 Connection con = DB.getConnection();
		PreparedStatement ps=con.prepareStatement("INSERT INTO librarian(`ID`,`Name`,`Password`)VALUES(?,?,?)");		
		
		ps.setString(1,ID);
		ps.setString(2,Name);
		ps.setString(3,Password);
	 status=ps.executeUpdate();
	 con.close();
	 }catch(Exception e){System.out.println(e);}
		return status;
 }

public static int delete (int ID ){
	int status =0;
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps =con.prepareStatement("delete from librarian where id=?");
		ps.setInt(1,ID);
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}

public static boolean validate (String Name,String Password){
boolean status = false;
try{
Connection con=DB.getConnection();
PreparedStatement ps=con.prepareStatement("select * from librarian where name=? and password=?");
ps.setString(1,Name);
ps.setString(2,Password);
ResultSet rs=ps.executeQuery();
status=rs.next();
con.close();
}catch(Exception e){System.out.println(e);}
return status;
    }
}