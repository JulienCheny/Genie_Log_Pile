package launcher;

import controller.*;
import model.Pile;
import view.MainWindow;
import view.PileBottomWindow;

public class Application {
	public static void main(String[] args) {
		MainWindow mainWin = new MainWindow();
		PileBottomWindow pileBottomWin = new PileBottomWindow();
		
		CommandInterpreter interpreter = new CommandInterpreter();
		Pile pile = new Pile();
		interpreter.addCommand("clear",new ClearActionListener(pile));
		interpreter.addCommand("push", new PushActionListener(pile));
		interpreter.addCommand("pop", new  PopActionListener(pile));
		interpreter.addCommand("quit", new QuitActionListener(mainWin, pileBottomWin));
	}
}
