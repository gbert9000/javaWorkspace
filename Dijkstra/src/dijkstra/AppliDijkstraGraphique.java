package dijkstra;

import java.io.IOException;

import javax.swing.JFrame;

public class AppliDijkstraGraphique {
	public static void main(String[] arg) throws IOException  {
		JFrame fenetre = new JFrame("Plus cours chemins");
	 	Arborescence dijkstra = new Arborescence("lib/rana.txt");
	 	dijkstra.marquerArbo();
	 	fenetre.setContentPane(new PanneauDessin(dijkstra));
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.pack();
		fenetre.setVisible(true);
	}
}
