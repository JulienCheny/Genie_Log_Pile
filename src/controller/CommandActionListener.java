package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CommandActionListener implements ActionListener {
	private List<String> command;
	
	public List<String> getCommand() {
		return command;
	}


	public void setCommand(List<String> command) {
		this.command = command;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	}

	
}
