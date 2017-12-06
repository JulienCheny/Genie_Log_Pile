package controller;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("serial")
public class CommandInterpreter {
	//private List<Command> commandList = new ArrayList<Command>();
	private HashMap<String, CommandActionListener> commandList = new HashMap<>();
	
	public CommandInterpreter() {
	}
	
	public void addCommand(String caller, CommandActionListener action) {
		commandList.put(caller, action);
	}
	public void removeCommand(String caller) {
		commandList.remove(caller);
	}
	public void interpret(String message) {
		List<String> argv = Arrays.asList(message.split(" "));
		CommandActionListener action = commandList.get(argv.get(0));
		action.setCommandList(argv);
		action.notify();
	}
}
