package action;


import java.io.*;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.*;

public class ActionSauver extends AbstractAction {
    JTextArea vue;

    public ActionSauver(JTextArea txt) {
	
    	ImageIcon iconSauver = new ImageIcon(new ImageIcon("icones/save-icon.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));

    	
    	vue = txt;
    	putValue(Action.NAME, "Sauver");
        putValue(Action.SMALL_ICON,iconSauver);
//                 new ImageIcon("icones/save-icon.png", "sauver"));
        putValue(Action.MNEMONIC_KEY, KeyEvent.VK_S);
        putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(
        KeyEvent.VK_S, ActionEvent.CTRL_MASK));
    }
    
    public void actionPerformed(ActionEvent evt) {
	JFileChooser fc = new JFileChooser();
	int ret;

	ret = fc.showDialog(null, "Choisir un fichier à ouvrir");
	if (ret == JFileChooser.APPROVE_OPTION) {
	    try {
		File fWrite = fc.getSelectedFile();
		FileWriter fw = new FileWriter(fWrite);
		vue.write(fw);
		JOptionPane.showMessageDialog(null, "Fichier enregistré", "Enregistrement effectué", JOptionPane.INFORMATION_MESSAGE);
	    } catch (IOException e) {
		JOptionPane.showMessageDialog(null, e.toString(), "Échec", JOptionPane.ERROR_MESSAGE);
	    }
	}
    }
}
