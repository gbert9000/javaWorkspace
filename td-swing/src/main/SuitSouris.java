package main;

import javax.swing.*;

import java.awt.*;

public class SuitSouris {
	static 	JLabel labelX = new JLabel("Position X : ", JLabel.CENTER);
	static 	JLabel labelY = new JLabel("Position Y : ", JLabel.CENTER);
	static 	JLabel labelClicNombre = new JLabel("Nombre de clics : ", JLabel.CENTER);
	static 	JLabel labelClicEtat = new JLabel("Etat : ", JLabel.CENTER);
	
	public static void main(String[] args) {
	JFrame jf;
	JPanel pSouris;
	GridLayout grid = new GridLayout(3,3);
	JLabel label; //récupération du compte-rendu des évenements souris

	MListen myListener = new MListen(new SuitSouris());
	
	jf = new JFrame("Suit la souris");
	pSouris = new JPanel();
	
	label = new JLabel("le texte");
	pSouris.add(label);
	
	pSouris.setPreferredSize(new Dimension(400,400));
	pSouris.setLayout(grid);
	pSouris.add(labelX);
	pSouris.add(labelY);
	pSouris.add(labelClicNombre);
	pSouris.add(labelClicEtat);
	pSouris.addMouseListener(myListener);
	pSouris.addMouseMotionListener(myListener);

	jf.add(pSouris);
	jf.pack();
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setVisible(true);
    }

	public void majLabelX(int x) {
		labelX.setText(Integer.toString(x)); //abscisses
	}
   
	public void majLabelY(int y) {
		labelY.setText(Integer.toString(y)); //ordonnées
	}
	
	public void majLabelClic(int compte) {
		labelClicNombre.setText(Integer.toString(compte)); //récupération du compteur clic
	}

	public void majLabelClicEtat(String etat) {
		labelClicEtat.setText(etat); //état du clic (pressé, cliqué, relaché,...)
	}
    
}