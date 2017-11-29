package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Pile;

public class PopActionListener extends CommandActionListener implements ActionListener {
	private Pile pile;
	
	public PopActionListener(Pile pile) {
		super();
		this.pile = pile;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
