package launcher;

import controller.*;
import model.Pile;
import view.MainWindow;
import view.PileBottomWindow;

public class Application {
	public static void main(String[] args) {		
		CommandInterpreter interpreter = new CommandInterpreter();
		Pile pile = new Pile();
		
		MainWindow mainWin = new MainWindow(interpreter, pile);
		PileBottomWindow pileBottomWin = new PileBottomWindow(pile);
		
		interpreter.addCommand("clear",new ClearActionListener(pile, mainWin, pileBottomWin));
		interpreter.addCommand("push", new PushActionListener(pile, mainWin, pileBottomWin));
		interpreter.addCommand("pop", new  PopActionListener(pile, mainWin, pileBottomWin));
		interpreter.addCommand("quit", new QuitActionListener(mainWin, pileBottomWin));
	}
}
