package librarycse;

import java.awt.Container;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Librarian extends JFrame {

	public static void main(String[] args) {
		
		final JFrame jf = new JFrame ("Library Login");
		JPanel panel = new JPanel();
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel AdminLogin = new JLabel("Library Login");
		final JTextField user = new JTextField(10);
		final JPasswordField pass = new JPasswordField(10);
		JLabel namelabel = new JLabel("Name");
		JLabel passlabel = new JLabel("Password");
		JButton login = new JButton("Login");
		namelabel.setLabelFor(user);
		passlabel.setLabelFor(pass);
		panel.add(AdminLogin);panel.add(user);panel.add(pass);panel.add(namelabel);panel.add(passlabel);panel.add(login);
		Container contentpane = jf.getContentPane();
		contentpane.add(panel);
				
		GroupLayout groupLayout = new GroupLayout(contentpane);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(124)
							.addComponent(AdminLogin))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(19)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(namelabel)
								.addComponent(passlabel))
							.addGap(47)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(pass)
								.addComponent(user, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))))
					.addContainerGap(107, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(187, Short.MAX_VALUE)
					.addGap(20)
					.addComponent(login, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addGap(151))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(AdminLogin)
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(namelabel)
						.addComponent(user, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(passlabel)
						.addComponent(pass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(login, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(80, Short.MAX_VALUE))
		);
		contentpane.setLayout(groupLayout);
	

		login.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String Name =user.getText();
				String Password =String.valueOf(pass.getPassword());
				if(LibrarianDB.validate(Name,Password)){
					librarySuccess.main(new String[]{});
					jf.dispose();
				}else{
					JOptionPane.showMessageDialog(null, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
					user.setText("");
					pass.setText("");
				}
					}
					});	
		
		jf.setVisible(true);
		jf.setSize(450,400);
	}	
	}

