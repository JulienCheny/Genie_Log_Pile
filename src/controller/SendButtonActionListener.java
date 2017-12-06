package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class SendButtonActionListener implements ActionListener {
	JTextField textField;
	CommandInterpreter interpreter;
	
	public SendButtonActionListener(JTextField textField, CommandInterpreter interpreter) {
		this.textField = textField;
		this.interpreter = interpreter;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		interpreter.interpret(textField.getText());
	}
}
