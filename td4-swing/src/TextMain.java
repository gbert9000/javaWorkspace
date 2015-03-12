
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

import action.*;

public class TextMain {
    public static JMenuBar createMenu(final JTextArea disp, Action actOuvrir, Action actSauver, Action actQuitter) {
		JMenuBar barreMenu;
		barreMenu = new JMenuBar();
	
		JMenu menuFic = new JMenu("Fichier");
		JMenuItem itOuvrir = new JMenuItem(actOuvrir);
		JMenuItem itSauver = new JMenuItem(actSauver);
		JMenuItem itQuitter = new JMenuItem(actQuitter);
	
		menuFic.add(itOuvrir);
		menuFic.add(itSauver);
		menuFic.addSeparator();
		menuFic.add(itQuitter);
	
		JMenu menuEdit = new JMenu("Édition");
		JMenuItem itCopy = new JMenuItem("Copier");
		JMenuItem itCut = new JMenuItem("Couper");
		JMenuItem itPaste = new JMenuItem("Coller");
		
		itCopy.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			    disp.copy();
			    System.out.println("copy");
			}
		    });
		itCut.addActionListener(new ActionListener()  {
			
			public void actionPerformed(ActionEvent e) {
			    disp.cut();
			    System.out.println("cut");
			}
		    });
		itPaste.addActionListener(new ActionListener()  {
			
			public void actionPerformed(ActionEvent e) {
			    disp.paste();
			    System.out.println("paste");
			}
		    });
	
		menuEdit.add(itCopy);
		menuEdit.add(itCut);
		menuEdit.add(itPaste);
	
		barreMenu.add(menuFic);
		barreMenu.add(menuEdit);
	
		return barreMenu;
    }

    public static JToolBar createToolBar(Action actOuvrir, Action actSauver, Action actQuitter) {
		JToolBar tb = new JToolBar();
		tb.add(actOuvrir);
		tb.add(actSauver);
		tb.add(actQuitter);
		return tb;
    }

    public static void main(String[] args) {
		JFrame jf = new JFrame("Texte");
	
		JTextArea textDisplay = new JTextArea();
	        JScrollPane jsp;
	
		Action open = new ActionOuvrir(textDisplay);
		Action save = new ActionSauver(textDisplay);
		Action quit = new ActionQuitter();
	
		jf.setJMenuBar(createMenu(textDisplay, open, save, quit));
		jf.add(createToolBar(open, save, quit), BorderLayout.NORTH);
	
		jsp = new JScrollPane(textDisplay); 
		jsp.setPreferredSize(new Dimension(600, 700));
		jf.add(jsp, BorderLayout.CENTER);
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
    }
}