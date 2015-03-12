import java.awt.Dimension;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;


public class TestMenus {
	  public static void main(String[]  args) {
		
		 Action quitter = new ActionQuitter();
		  
		JFrame jf = new JFrame("testBoxLayout");

		JMenuBar barreMenu = new JMenuBar();
		
		JMenu menuUn = new JMenu("Menu 1");
		JMenu menuDeux = new JMenu("Menu 2");
		JMenu menuTrois = new JMenu("Menu 3");
		
		JMenuItem premItem = new JMenuItem("item 1");
		JMenuItem secItem = new JMenuItem("item 2");
		JMenuItem quitItem = new JMenuItem(quitter);
		JCheckBoxMenuItem optItem = new JCheckBoxMenuItem("Option");
		JRadioButtonMenuItem choixUnItem = new JRadioButtonMenuItem("Choix 1");
		JRadioButtonMenuItem choixDeuxItem = new JRadioButtonMenuItem("Choix 2");
		ButtonGroup grp = new ButtonGroup();
		grp.add(choixUnItem);
		grp.add(choixDeuxItem);
		JMenuItem troisItem = new JMenuItem("Item 3");
		
		menuUn.add(premItem);
		menuUn.add(secItem);
		menuUn.addSeparator();
		menuUn.add(quitItem);
		menuDeux.add(optItem);
		menuDeux.addSeparator();
		menuDeux.add(choixUnItem);
		menuDeux.add(choixDeuxItem);
		menuTrois.add(troisItem);
		menuDeux.add(menuTrois);
		barreMenu.add(menuUn);
		barreMenu.add(menuDeux);
		
		jf.setJMenuBar(barreMenu);
		jf.setPreferredSize(new	Dimension(400, 250));
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	
}
