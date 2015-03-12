package td_2_3;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Vue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame fen = new JFrame("Dessin Traits");
		fen.setSize(500, 500);
		fen.setLocationRelativeTo(null);
		fen.setVisible(true);
		
		JPanel pan = new JPanel();
		fen.getContentPane().add(pan);
		
		//lien vers Controleur
		pan.addMouseListener(new Controleur(pan));
		
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
