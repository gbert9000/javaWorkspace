package action;

import java.awt.Image;
import java.awt.event.*;

import javax.swing.*;

public class ActionQuitter extends AbstractAction {
    public ActionQuitter() {
    	
    	ImageIcon iconQuitter = new ImageIcon(new ImageIcon("icones/close-icon.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));

    	
    	putValue(Action.NAME, "Quitter");
        putValue(Action.SMALL_ICON,iconQuitter);
       //          new ImageIcon("icones/close-icon.png", "quitter"));
        putValue(Action.MNEMONIC_KEY, KeyEvent.VK_Q);
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(
        KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
    }
    
    public void actionPerformed(ActionEvent evt) {
	int ret = JOptionPane.showConfirmDialog(null, "Êtes vous sûrs de vouloir quitter ?", "Quitter", JOptionPane.YES_NO_OPTION);

	if (ret == JOptionPane.YES_OPTION) {
	    System.out.println("Bye");
	    System.exit(0);
	}
    }
}