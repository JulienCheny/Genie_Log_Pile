package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Pile;
import view.MainWindow;
import view.PileBottomWindow;

public class ClearActionListener extends CommandActionListener implements ActionListener {
	private Pile pile;
	private MainWindow mainWin;
	private PileBottomWindow pileBottomWin;
	
	public ClearActionListener(Pile pile, MainWindow mainWin, PileBottomWindow pileBottomWin) {
		this.pile = pile;
		this.mainWin = mainWin;
		this.pileBottomWin = pileBottomWin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		pile.clear();
		//mainWin.update();
		//pileBottomWin.update();
	}

}
