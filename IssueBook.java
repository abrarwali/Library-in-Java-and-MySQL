package librarycse;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Font;

public class IssueBook extends JFrame {

	private JPanel contentPane;
	JTextField sid = new JTextField(10);
	JLabel stid = new JLabel("Student ID");
	JTextField bid = new JTextField(10);
	JLabel bkid = new JLabel("Book ID");
	JButton issuebtn = new JButton("Issue");
	private final JLabel lblIssueBook = new JLabel("Issue Book");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IssueBook frame = new IssueBook();
					frame.setTitle("Issue Book");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IssueBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,500, 600);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		stid.setBounds(80, 150, 200, 30);
	    sid.setBounds(180, 150, 200, 30);
	    bkid.setBounds(80, 200, 200,30);
	    bid.setBounds(180, 200, 200, 30);
	    stid.setLabelFor(sid);
	    bkid.setLabelFor(bid);
	    
	    issuebtn.setBounds(250, 250, 100, 30);
		contentPane.add(sid);contentPane.add(stid);contentPane.add(issuebtn);
		contentPane.add(bid);contentPane.add(bkid);
lblIssueBook.setFont(new Font("Times New Roman", Font.PLAIN, 18));
lblIssueBook.setBounds(207, 109, 128, 30);
contentPane.add(lblIssueBook);
		
					
	issuebtn.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			
			String s =sid.getText();
			String t =bid.getText();
				
		
							if(issueReturnDB.checkbook(t)){
					int i=issueReturnDB.save(s);
					System.out.println(i);
					if (i>0)
				   	JOptionPane.showMessageDialog(null,"Book Issued Successfully");
						}
							else{
								JOptionPane.showMessageDialog(null,"Invalid Request");
							}
			
		}
		
	});
	}
}
