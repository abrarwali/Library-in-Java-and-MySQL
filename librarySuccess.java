package librarycse;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class librarySuccess extends JFrame{
static JFrame fr = new JFrame("Librarian Controls");
static JButton b1 = new JButton("View Books");
static JButton b2 = new JButton ("Issue Book");
static JButton b3 = new JButton ("Return Book");
static JLabel label = new JLabel("Choose an Option"); 	
	public static void main(String[] args) {
		fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
		fr.setBounds(0, 0, 450, 450);
		fr.setVisible(true);
		fr.setLayout(null);
		Container cp = fr.getContentPane();
		cp.add(b1);cp.add(b2);cp.add(b3);cp.add(label);
		label.setBounds(100, 0, 150, 150);
		b1.setBounds(150, 100, 150, 60);
		b2.setBounds(150, 200, 150, 60);
		b3.setBounds(150, 300, 150, 60);
		
		b1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				viewbooks.main(new String[]{});
				fr.dispose();
			}			
		});//Button B1
b2.addActionListener(new ActionListener (){

	public void actionPerformed(ActionEvent e) {
		IssueBook.main(new String[] {});
		fr.dispose();
	}	
}); //  Button 2

b3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		returnbook.main(new String[] {});
		fr.dispose();
	}	
});

	}//end main

}//end class
