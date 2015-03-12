import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Dialogues {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Texte");
		String [] choix = {"Partir", "Rester"};
		JOptionPane.showMessageDialog(jf,"Lancement de la fenêtre.");
		JOptionPane.showConfirmDialog(jf,"oui ou non ?");
		JOptionPane.showInputDialog(jf, "Choisir une action", "Choix", //Partir ou Rester
		JOptionPane.QUESTION_MESSAGE, null, choix, null);
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}