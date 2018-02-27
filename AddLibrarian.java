package librarycse;

import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class AddLibrarian extends JFrame {
    JFrame jf = new JFrame ("Add Librarian");
	JButton AddLib = new JButton("Add");
	final JTextField user = new JTextField(10);
	final JTextField ID = new JTextField(5);
	final JPasswordField passw = new JPasswordField(10); 
	JLabel id = new JLabel("Set ID");
	JLabel uname = new JLabel("Set Username");
	JLabel pass = new JLabel ("Set Password ");
	JPanel panel = new JPanel();
	public  AddLibrarian(){                           //Constructor
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = jf.getContentPane();
		panel.setLayout(null);
		uname.setLabelFor(user);
		pass.setLabelFor(passw);
		id.setLabelFor(ID);
panel.add(uname);panel.add(pass);panel.add(user);panel.add(passw);panel.add(AddLib);panel.add(ID);panel.add(id);
cp.add(panel);

uname.setBounds(80, 50, 200, 30);user.setBounds(180, 50, 200,30);
pass.setBounds(80, 100, 200, 30);passw.setBounds(180, 100, 200,30);
id.setBounds(80, 150, 200, 30);ID.setBounds(180, 150, 200,30);
AddLib.setBounds(200,200,100,60);

AddLib.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent e) {
		String id = ID.getText();
		String name=user.getText();
		String password=String.valueOf(passw.getPassword());
		int i=LibrarianDB.save(id, name,password);
		if(i>0){
			JOptionPane.showMessageDialog(null,"Librarian added successfully!");
			Adminview.main(new String[]{});
			jf.dispose();
			
		}else{
			JOptionPane.showMessageDialog(null,"Sorry, unable to save!");
			jf.dispose();
			Adminview.main(new String[]{});
		}	
	}
	});
jf.setVisible(true);
jf.setSize(500,500);
	}
}
