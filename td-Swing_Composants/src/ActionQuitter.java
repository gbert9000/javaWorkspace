import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

public class ActionQuitter extends AbstractAction {
	
	public ActionQuitter() {
		putValue(Action.NAME, "Quitter");
		putValue(Action.LARGE_ICON_KEY,
		new ImageIcon("icones/sortie.gif", "sortie"));
		putValue(Action.MNEMONIC_KEY, KeyEvent.VK_Q); //Navigation dans les menus (ex: Alt>Menu1>Quitter). le Q de Quitter est souligné !
		putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(
		KeyEvent.VK_Q, ActionEvent.CTRL_MASK)); //Raccourci clavier ex: Ctrl+Q
	}

	public void actionPerformed(ActionEvent evt) {
		System.out.println("bye");
		System.exit(0); //termine le programme
	}
}