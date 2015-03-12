package q3;

import javax.swing.*;

public class SuitSouris {

    public static void main(String[] args) {
	PanSouris pan;
	ContSouris cont;
	JFrame fen = new JFrame("Surveillance souris");

	pan = new PanSouris();

	cont = new ContSouris(pan);
	pan.addMouseListener(cont);
	pan.addMouseMotionListener(cont);

	fen.add(pan);
	fen.pack();
	fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fen.setVisible(true);
    }
}