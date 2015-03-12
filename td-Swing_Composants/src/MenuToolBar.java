import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToolBar;

public class MenuToolBar {
	JMenuBar barreMenu;
	JToolBar tb;
	
	public MenuToolBar() {
		Action quitter = new ActionQuitter();
		barreMenu = new JMenuBar();
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
		tb = new JToolBar();
		tb.add(new JButton(new ImageIcon("icones/save.gif", "save")));
		tb.add(new JButton(new ImageIcon("icones/tip.gif", "tip")));
		tb.add(new JButton(quitter));
	}
	
	public JMenuBar getBarreMenu() {
		return barreMenu; 
	}
	public JToolBar getToolBar() { 
		return tb; 
	}
	
	public static void main(String [] args) {
		JFrame jf = new JFrame("Menus");
		MenuToolBar mtb = new MenuToolBar();
		JToolBar tb = mtb.getToolBar();
		JPanel pan = new JPanel(new BorderLayout());
		pan.add(tb, BorderLayout.NORTH);
		jf.setJMenuBar(mtb.getBarreMenu());
		jf.add(pan);
		jf.setPreferredSize(new Dimension(400, 250));
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}