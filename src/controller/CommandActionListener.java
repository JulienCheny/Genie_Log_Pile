package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CommandActionListener implements ActionListener {
	private List<String> commandList;
	
	public List<String> getCommandList() {
		return commandList;
	}

	public String getCommand(int index) {
		return commandList.get(index);
	}

	public void setCommandList(List<String> command) {
		this.commandList = command;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	}

	
}
