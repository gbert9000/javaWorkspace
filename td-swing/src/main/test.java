package main;
import javax.swing.JFrame;

import tdSwing.StrCont;
import tdSwing.StrGUI;
import tdSwing.StrModel;


//TD1 - Fenêtre, Panel,...
public class test {

		//TD1
	public static void main(String[] args) {
		JFrame jf = new JFrame("Exemple Swing MVC");
		StrModel sm = new StrModel();
		StrCont sc = new StrCont(sm);
		StrGUI sv = new StrGUI(sm, sc);
		
		sc.setStrGUI(sv);		
		
		jf.add(sv);
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	
}
