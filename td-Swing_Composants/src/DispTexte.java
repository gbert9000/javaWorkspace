import java.awt.BorderLayout;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class DispTexte {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Texte");
		JTextArea textDisplay = new JTextArea();
		String chemin = "txt/input.txt";
		jf.add(textDisplay, BorderLayout.CENTER);
			try {
				File fRead = new File(chemin);
				FileReader fr = new FileReader(fRead);
				textDisplay.read(fr, null);
			} catch (IOException e) {
				System.out.println("Erreur de lecture de " + chemin);
				System.exit(1);
			}
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}