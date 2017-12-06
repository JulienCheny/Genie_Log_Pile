package view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class MainWindow extends JFrame {
	private JTextField textField;
	private JTextField txtFirstElement;
	public MainWindow() {
		getContentPane().setLayout(null);
		
		JButton btnSend = new JButton("SEND");
		btnSend.setBounds(303, 181, 89, 23);
		getContentPane().add(btnSend);
		
		textField = new JTextField();
		textField.setBounds(91, 181, 212, 23);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(265, 89, 127, 45);
		getContentPane().add(lblNewLabel);
		
		txtFirstElement = new JTextField();
		txtFirstElement.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtFirstElement.setText("First element : ");
		txtFirstElement.setBounds(76, 89, 163, 45);
		getContentPane().add(txtFirstElement);
		txtFirstElement.setColumns(10);
	}
}
