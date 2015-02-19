package mvc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JTextArea;


/*le modele*/
public class StrModel {

	private StringBuffer sb;

	public StrModel() {
		sb = new StringBuffer();
	}

	public void append(String texte) {
		sb.append(texte);
	}
	
	public String getValue() {
		return sb.toString();
	}

	public void eraseContentSaisie(JTextArea texte) {
		try {
			if(texte != null){
				texte.repaint();
			}
 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void saveFile(String contenu, String file) {
		try {
			PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(file)));
 
			writer.write(contenu);
 
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
 
	public String readFile(String file) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String ligne;
			StringBuffer fichier = new StringBuffer();
 
			while((ligne = reader.readLine()) != null){
				fichier.append(ligne);
				fichier.append("\n");			
			}
			reader.close();
 
			return fichier.toString();		
		} catch (IOException e) {
			return e.getMessage();
		}
	}


}

