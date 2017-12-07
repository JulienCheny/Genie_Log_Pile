package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Pile;
import view.MainWindow;
import view.PileBottomWindow;

public class PopActionListener extends CommandActionListener implements ActionListener {
	private Pile pile;
	private MainWindow mainWin;
	private PileBottomWindow pileBottomWin;
	
	public PopActionListener(Pile pile, MainWindow mainWin, PileBottomWindow pileBottomWin) {
		super();
		this.pile = pile;
		this.mainWin = mainWin;
		this.pileBottomWin = pileBottomWin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		pile.pop();
		
		mainWin.update();
		if(pile.size() < 5)
			pileBottomWin.update();
	}

}
