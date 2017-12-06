package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Pile;

public class PushActionListener extends CommandActionListener implements ActionListener {
	private Pile pile;
	public PushActionListener(Pile pile) {
		this.pile = pile;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String int1 = getCommand(1);
		pile.push(Integer.getInteger(getCommand(1)));
	}

}
