package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Pile;

public class ClearActionListener extends CommandActionListener implements ActionListener {
	private Pile pile;
	public ClearActionListener(Pile pile) {
		this.pile = pile;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		pile.clear();

	}

}
