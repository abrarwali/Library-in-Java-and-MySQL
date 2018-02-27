package librarycse;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class returnbook extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					returnbook frame = new returnbook();
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
	public returnbook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblReturnBook = new JLabel("Return Book");
		lblReturnBook.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblReturnBook.setBounds(159, 46, 85, 38);
		contentPane.add(lblReturnBook);
		
		JLabel lblBookId = new JLabel("Book ID");
		lblBookId.setBounds(105, 107, 46, 14);
		contentPane.add(lblBookId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(188, 104, 159, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Return");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String t = textField_1.getText();
				
		int i = issueReturnDB.returnbook(t);
				if (i>0)
				 	JOptionPane.showMessageDialog(null,"Book returned Successfully");
			
				else{
					JOptionPane.showMessageDialog(null,"Invalid Request");
				}

			}
		});
		btnNewButton.setBounds(245, 145, 102, 38);
		contentPane.add(btnNewButton);
		
	}
}
