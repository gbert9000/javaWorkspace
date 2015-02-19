/* Fenêtre vide*/
package tdSwing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exemple1 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public Exemple1(String t) {
		super(t);
		//this.setLocation(300, 300);
		this.setSize(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
	
	
	public static void main(String[] args) {
		Exemple1 maFen = new Exemple1("Exemple");
		maFen.setVisible(true);
		
		//Composants
		Container monPane = maFen.getContentPane();
		JButton monBoutA = new JButton("Bouton A");
		JButton monBoutB = new JButton("Bouton B");
		
		monBoutA.setSize(30, 30);
		monBoutB.setSize(30, 30);
		
		//Listener
		monBoutA.addActionListener(new BoutAList());
		monBoutB.addActionListener(new BoutBList());
		
		//Disposition des composants
		//grid sur une ligne et 2 colonnes
		FlowLayout monLayout = new FlowLayout();
		monPane.setLayout(monLayout);
		monPane.add(monBoutA,BorderLayout.SOUTH);
		monPane.add(monBoutB,BorderLayout.SOUTH);
	}
}

class BoutAList implements ActionListener {
	public void actionPerformed(ActionEvent evt) {
	System.out.println("Bouton A cliqué!");
	}
}
class BoutBList implements ActionListener {
	public void actionPerformed(ActionEvent evt) {
	System.out.println("Bouton B cliqué!");
	}
}
