package action;


import java.io.*;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.*;

public class ActionOuvrir extends AbstractAction {
    JTextArea vue;


    
    public ActionOuvrir(JTextArea txt) {
	
    	ImageIcon iconOuvrir = new ImageIcon(new ImageIcon("icones/open-icon.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
    	
    	vue = txt;

		putValue(Action.NAME, "Ouvrir");
        putValue(Action.SMALL_ICON,iconOuvrir);
//                 new ImageIcon("icones/open-icon.png", "ouvrir"));
        putValue(Action.MNEMONIC_KEY, KeyEvent.VK_O);
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(
        KeyEvent.VK_O, ActionEvent.CTRL_MASK));
    }
    
    public void actionPerformed(ActionEvent evt) {
	JFileChooser fc = new JFileChooser();
	int ret;

	ret = fc.showDialog(null, "Choisir un fichier à ouvrir");
	if (ret == JFileChooser.APPROVE_OPTION) {
	    try {
		File fRead = fc.getSelectedFile();
		FileReader fr = new FileReader(fRead);
		vue.read(fr, null);
	    } catch (IOException e) {
		JOptionPane.showMessageDialog(null, "Erreur de lecture de " + 
					      fc.getSelectedFile().getName(), "Erreur", JOptionPane.ERROR_MESSAGE);
		System.out.println("Erreur de lecture de " + 
				   fc.getSelectedFile().getName());
	    }
	}
	System.out.println("Ouvrir");
    }
}