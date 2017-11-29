package launcher;

import controller.*;
import model.Pile;

public class Application {
	public static void main(String[] args) {
		CommandInterpreter interpreter = new CommandInterpreter();
		Pile pile = new Pile();
		interpreter.addCommand("clear",new ClearActionListener(pile));
		interpreter.addCommand("push", new PushActionListener(pile));
		interpreter.addCommand("pop", new  PopActionListener(pile));
		interpreter.addCommand("quit", new QuitActionListener());
	}
}
