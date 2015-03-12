import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DialoguesFicCoul { 
	public static void main(String[] args) {
		JFrame jf = new JFrame("Fichier & couleur");
		JTextArea textDisplay = new JTextArea();
		JFileChooser ficC = new JFileChooser();
		JScrollPane jsp; 
		int retFic;
		Color fond = JColorChooser.showDialog(jf, "Choisir une couleur de fond",
		Color.white);
		retFic = ficC.showDialog(jf, "Choisir un fichier à charger");
			try {
				File fRead = ficC.getSelectedFile();
				FileReader fr = new FileReader(fRead);
				textDisplay.read(fr, null);
				textDisplay.setBackground(fond);
			} catch (IOException e) {
				System.out.println("Erreur de lecture de " + ficC.getSelectedFile().getName());
				System.exit(1);
			}
		jsp = new JScrollPane(textDisplay);
		jf.add(jsp, BorderLayout.CENTER);
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}