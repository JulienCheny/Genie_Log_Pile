package view;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import java.awt.Font;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

import model.Pile;

import javax.swing.JList;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class PileBottomWindow extends JFrame implements Observer{
	private Pile pile;
	private JList<Object> listElements = new JList<>();
	
	public PileBottomWindow(Pile pile) {
		this.setResizable(false);
		this.setLocation(640, 200);
		this.setSize(250, 300);
		getContentPane().setLayout(null);
		
		this.pile = pile;
		
		listElements.setBounds(61, 85, 110, 151);
		getContentPane().add(listElements);
		
		JLabel lblTxtBotOfPile = new JLabel("Bottom of the pile");
		lblTxtBotOfPile.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTxtBotOfPile.setBounds(22, 11, 190, 66);
		getContentPane().add(lblTxtBotOfPile);
		
		update();
		
		this.setVisible(true);
	}
	
	public void update() {
		List<String> strList = pile.getFiveLastElements();
		if(strList.size() == 0) {
			listElements.setListData(new Vector<>());
		}
		else
			listElements.setListData(strList.toArray());
	}

	@Override
	public void update(Observable o, Object arg) {
		update();
	}
}
