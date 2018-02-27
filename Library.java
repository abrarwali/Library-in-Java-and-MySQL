package librarycse;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.GroupLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;



public class Library extends JFrame{

	public static void main(String args[]){
		
	final JFrame jf = new JFrame ("Library");
	JPanel panel = new JPanel();
	jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	JButton Adminbutton = new JButton ("Admin");
	JButton Libbutton = new JButton ("Library Login ");
	JLabel LibraryManagement = new JLabel("Library Management By Abrar Wali");
	LibraryManagement.setFont(new Font("Times ", Font.BOLD, 15));
	panel.add(LibraryManagement);
	panel.add(Adminbutton);
	panel.add(Libbutton);
	Container contentpane =jf.getContentPane();
	contentpane.add(panel);
	//   SET ALIGNMENT
	GroupLayout groupLayout = new GroupLayout(contentpane);
	contentpane.setLayout(groupLayout);
		/*Horizontal*/
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(64)
							.addComponent(LibraryManagement))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(140)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
								.addComponent(Libbutton, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(Adminbutton, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))
					.addContainerGap(95, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(LibraryManagement)
					.addGap(32)
					.addComponent(Adminbutton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(Libbutton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(70, Short.MAX_VALUE))
		);;
	
	jf.setVisible(true);
	jf.setSize(450,400);
		Adminbutton.addActionListener(new ActionListener(){
 		
		public void actionPerformed(ActionEvent e) {
	
		Admin.main(new String[]{});
		jf.dispose();
		}
 });
Libbutton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
		Librarian.main(new String[] {});
		jf.dispose();
	}
	 });
	}
	

}
