package tdSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Vue extends JFrame implements Observer {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton bouton1,bouton2;

    Vue() {
	this.setTitle("Deux beaux boutons");
	
	bouton1 = new JButton("Bouton de Gauche");
	bouton2 = new JButton("Bouton de Droite");
	JPanel panneau = new JPanel();
	bouton1.setBackground(Color.YELLOW);
	bouton2.setBackground(Color.RED);
	panneau.add(bouton1);
	panneau.add(bouton2);
	add(panneau, BorderLayout.CENTER);
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.pack();
	this.setLocation(200,200);
	this.setVisible(true);
	
    }

    public void update(Observable leModele, Object arg) {
	bouton1.setBackground(((Modele)leModele).couleur1);
	bouton2.setBackground(((Modele)leModele).couleur2);
    }
}