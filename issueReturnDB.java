package librarycse;
import java.sql.*;
public class issueReturnDB {
public static boolean  checkbook (String  Book_id){
	boolean status = false;
	try{
		Connection con=DB.getConnection();
	
		PreparedStatement ps=con.prepareStatement("select from book_account where book_id=? ");
		ps.setString(1, Book_id);
		
		ResultSet rs=ps.executeQuery();
		status=rs.next();
		con.close();
	}catch(Exception e ){
     e.printStackTrace();		
	}
	//System.out.println(status);
return (status);   
}
public static int save (String ISSUED_TO){
	int status =0;
	 try{
		 Connection con = DB.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into book_account (`ISSUED_TO`) values (?)");
		
		ps.setString(1,ISSUED_TO);
		
	 status=ps.executeUpdate();
	 con.close();
	 }catch(Exception e) {
		 e.printStackTrace();
		 }
		return status;
}
public static int returnbook (String Book_ID){
	int status =0;
	try{
		 Connection con = DB.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into book_account (`ISSUED_TO`) values (null) where BOOK_ID = ?");
		
		ps.setString(1, Book_ID);
		
	 status=ps.executeUpdate();
	 con.close();
	 }catch(Exception e) {
		 e.printStackTrace();
		 }
	return status;
}
}

