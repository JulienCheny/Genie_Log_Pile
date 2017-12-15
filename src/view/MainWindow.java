package view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener;

import controller.CommandInterpreter;
import controller.SendButtonActionListener;
import model.Pile;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("serial")
public class MainWindow extends JFrame implements Observer {
	private CommandInterpreter interpreter;
	private Pile pile;
	
	private JTextField textField = new JTextField();
	private JLabel lblFirstElement = new JLabel();
	
	public MainWindow(CommandInterpreter interpreter, Pile pile) {
		this.setResizable(false);
		this.setLocation(200, 200);
		this.setSize(430, 260);
		this.interpreter = interpreter;
		this.pile = pile;
		
		SendButtonActionListener sendActionListener = new SendButtonActionListener(textField, interpreter);
		
		getContentPane().setLayout(null);
		
		JButton btnSend = new JButton("SEND");
		btnSend.setBounds(303, 181, 89, 23);
		getContentPane().add(btnSend);
		btnSend.addActionListener(sendActionListener);
		
		textField.setBounds(91, 181, 212, 23);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.addActionListener(sendActionListener);
		
		lblFirstElement.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblFirstElement.setBounds(265, 89, 127, 45);
		getContentPane().add(lblFirstElement);
		Integer firstElement = pile.getFirstElement();
		if(firstElement != null)
			lblFirstElement.setText(firstElement.toString());
		
		JLabel lblTxtFirstElement = new JLabel("First element : ");
		lblTxtFirstElement.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTxtFirstElement.setBounds(98, 92, 157, 39);
		getContentPane().add(lblTxtFirstElement);
		this.setVisible(true);
	}
	
	public void update() {
		Integer firstElement = pile.getFirstElement();
		if(firstElement == null)
			lblFirstElement.setText("");
		else
			lblFirstElement.setText(firstElement.toString());
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		update();
	}
}
