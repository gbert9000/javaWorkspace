package q2;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import vue.PanSouris;
import vue.PanStatut;

public class SuitSouris {

    public static void main(String[] args) {
	PanSouris pan;
	PanStatut panStatut;
	ContSouris cont;
	JFrame fen = new JFrame("Surveillance souris");
	pan = new PanSouris();
	panStatut = new PanStatut();

	cont = new ContSouris(panStatut);
	pan.addMouseListener(cont);
	pan.addMouseMotionListener(cont);

	fen.add(panStatut, BorderLayout.SOUTH);
	fen.add(pan);
	fen.pack();
	fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fen.setVisible(true);
    }
}