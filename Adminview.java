package librarycse;

import java.awt.Container;
import java.sql.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Adminview extends JFrame{
	
static JFrame fr = new JFrame ("Admin Controls ");
static JButton b1 = new JButton("Add Librarian ");
static JButton b2 = new JButton ("Remove Librarian ");
	public static void main(String[] args) {
		
		
		
	fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
	JLabel LibraryManagement = new JLabel("ADMIN CONTROLS");
	Container cp = fr.getContentPane();
	cp.setLayout(null);
	cp.add(b1);cp.add(b2);
	b1.setBounds(100, 130, 200, 50);
	   b2.setBounds(100, 230, 200, 50);
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
		AddLibrarian al = new AddLibrarian();
		fr.dispose();
		}
		});
	b2.addActionListener(new ActionListener(){

		public void actionPerformed(ActionEvent e) {
			deleteLibrarian.main(new String []{});
			}
		});
	fr.setVisible(true);
	fr.setSize(450,500);
	}

}
