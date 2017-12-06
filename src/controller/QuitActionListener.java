package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MainWindow;
import view.PileBottomWindow;

public class QuitActionListener extends CommandActionListener implements ActionListener {
	private MainWindow mainWin;
	private PileBottomWindow pileBottomWin;
	
	public QuitActionListener(MainWindow mainWin, PileBottomWindow pileBottomWin) {
		super();
		this.mainWin = mainWin;
		this.pileBottomWin = pileBottomWin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		mainWin.dispose();
		pileBottomWin.dispose();
	}

}
