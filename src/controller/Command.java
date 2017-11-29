package controller;

import java.awt.event.ActionListener;

public class Command {
	private String caller;
	private ActionListener action;
	public Command(String caller, ActionListener action) {
		super();
		this.caller = caller;
		this.action = action;
	}
	public String getCaller() {
		return caller;
	}
	public void setCaller(String caller) {
		this.caller = caller;
	}
	public ActionListener getAction() {
		return action;
	}
	public void setAction(ActionListener action) {
		this.action = action;
	}
	public boolean isCalled(String caller) {
		return this.caller == caller;
	}
	public void notifyAction() {
		action.notify();
	}
}
