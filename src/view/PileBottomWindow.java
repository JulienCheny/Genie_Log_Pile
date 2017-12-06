package view;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextPane;

import model.Pile;

import javax.swing.JTextArea;
import javax.swing.JList;

public class PileBottomWindow extends JFrame{
	private JTextField txtBottomOfThe;
	public PileBottomWindow(Pile pile) {
		this.setResizable(false);
		this.setLocation(640, 200);
		this.setSize(250, 300);
		getContentPane().setLayout(null);
		
		txtBottomOfThe = new JTextField();
		txtBottomOfThe.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtBottomOfThe.setText("Bottom of the pile");
		txtBottomOfThe.setEditable(false);
		txtBottomOfThe.setBounds(10, 11, 217, 63);
		getContentPane().add(txtBottomOfThe);
		txtBottomOfThe.setColumns(10);
		
		JList list = new JList();
		list.setBounds(61, 85, 110, 151);
		getContentPane().add(list);
		this.setVisible(true);
	}
}
