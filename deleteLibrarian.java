package librarycse;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class deleteLibrarian extends JFrame{
	static JFrame fr = new JFrame("Delete Librarian ");
	static JLabel choose = new JLabel("Delete Librarian ? ");
	static JButton b1 = new JButton("Delete");
	static JTextField tf = new JTextField(10);
	static JLabel jl = new JLabel("Enter ID");

	public static void main(String[] args) {
		fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
		fr.setBounds(0,0,450,450);
		Container cp =fr.getContentPane();
		fr.setLayout(null);
		cp.add(b1);cp.add(choose);cp.add(jl);cp.add(tf);
		jl.setLabelFor(tf);
		
		choose.setBounds(20, 20, 140, 150);
	jl.setBounds(80, 150, 200, 30);tf.setBounds(200, 150, 200,30);
		b1.setBounds(200, 200, 200, 50);
		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String s=tf.getText();
				if(s==null||s.trim().equals("")){
					JOptionPane.showMessageDialog(null,"Id can't be blank");
				}					
			else{
				int id=Integer.parseInt(s);
				int i=LibrarianDB.delete(id);
				if(i>0){
					JOptionPane.showMessageDialog(null,"Record deleted successfully!");
				}else{
					JOptionPane.showMessageDialog(null,"Unable to delete given id!");
				}
			}}
		});
fr.setVisible(true);
	}
}
	
