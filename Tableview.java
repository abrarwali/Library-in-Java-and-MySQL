package librarycse;
import java.awt.BorderLayout;
import java.awt.Container;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Tableview extends JFrame {
	static JFrame fr = new JFrame ("View Books ");
	boolean status;
	
	public Tableview  (){
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setBounds(100, 100, 450, 300);	
		//Container contentPane = fr.getContentPane();
		//fr.setLayout(null);
		fr.add(getTablePanel());
	    fr.setVisible(true);

	
	}
	
	private JPanel getTablePanel() { //METHOD
JPanel tableJPanel = new JPanel();
tableJPanel.setLayout(new BorderLayout());
String [] columns = {
		"BOOK_ID" ,"BOOK_NAME", "BOOK_AUTHOR", "PUBLISHING_HOUSE", 
		"ISSUED_TO" ,"ISSUE_DATE", "STATUS", "RETURN_DATE"
	};

Object[][] data = getStudentDetails();
JTable studentTable = new JTable(data, columns);


tableJPanel.add(studentTable.getTableHeader(), BorderLayout.NORTH);
tableJPanel.add(studentTable, BorderLayout.CENTER);
return tableJPanel;
		
	}
	private Object[][] getStudentDetails() { //METHOD
		Object[][] data = null;
		
		String QUERY = "Select BOOK_ID ,BOOK_NAME ,BOOK_AUTHOR ,PUBLISHING_HOUSE, ISSUED_TO"
				+ ", ISSUE_DATE ,STATUS,RETURN_DATE from student_details";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/deptt_library","root","8803718180");
			Statement statement = connection.createStatement();

		ResultSet rs = statement.executeQuery(QUERY);

		int rowCount = getRowCount(rs); // Row Count
		int columnCount = getColumnCount(rs); // Column Count

		data = new Object[rowCount][columnCount];

		// Starting from First Row for Iteration
		rs.beforeFirst();
		int i = 0;
		
		while (rs.next()) {

			int j = 0;

			data[i][j++] = rs.getString("BOOK_ID");
			data[i][j++] = rs.getString("BOOK_NAME");
			data[i][j++] = rs.getString("BOOK_AUTHOR");
			data[i][j++] = rs.getString("PUBLISHING_HOUSE");
			data[i][j++] = rs.getString("ISSUED_TO");
			data[i][j++] = rs.getString("ISSUE_DATE");
			data[i][j++] = rs.getString("STATUS");
			data[i][j++] = rs.getString("RETURN_DATE");

			i++;
		}

		status = true;
		
		// Closing the Resources;
		statement.close();
		connection.close();
				return data;
		} catch (Exception e) {

			e.printStackTrace();
		}
		return data;

		
	}
	// Method to get Row Count from ResultSet Object
		private int getRowCount(ResultSet rs) {

			try {
				
				if(rs != null) {
					
					rs.last();
					
					return rs.getRow(); 
				}
				
			} catch (SQLException e) {

				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
			return 0;
		}

		// Method to get Column Count from ResultSet Object
		private int getColumnCount(ResultSet rs) {

			try {

				if(rs != null)
					return rs.getMetaData().getColumnCount();

			} catch (SQLException e) {

				System.out.println(e.getMessage());
				e.printStackTrace();
			}

			return 0;
		}
		public String toString() {
			
			return (status) ? "Data Listed Successfully" : "Application Error Occured";
		}
		
		public static void main(String[] args) {

			Tableview tv = new Tableview ();

			System.out.println(tv);
		}
 }