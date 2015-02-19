package tdSwing;

import java.awt.*;
import javax.swing.*;
import tdSwing.StrModel;

public class StrGUI extends JPanel{
	
// Attributs
	private static final long serialVersionUID = 1L;
	JLabel disp;
	JPanel boutons = new JPanel();
	JPanel choix = new JPanel();
	JButton app;
	JButton appB;
	JButton annule;
	JCheckBox maj;
	JCheckBox min;
	StrModel data;
	ButtonGroup group = new ButtonGroup();
	GridLayout grid;
	JLabel label;
	JLabel emptyLabel;
	

/********************* Construction de la vue *****************************/
	
	public StrGUI(StrModel sm, StrCont sc) {
		super(new BorderLayout());
		
	//Initialisation
		disp = new JLabel(sm.getValue(), JLabel.CENTER);
		label = new JLabel("Choix de l'affichage : ", JLabel.CENTER);
		emptyLabel = new JLabel(" ", JLabel.CENTER);
		app = new JButton("Ajoute 'a'");
		appB = new JButton("Ajoute 'b'");
		annule = new JButton("Annuler");
		maj = new JCheckBox("Majuscle");
		min = new JCheckBox("Minuscule");
		grid = new GridLayout(2,2);
			
	//Ajoute les boutons d'ajout et de suppression de caractères
		boutons.add(app);
		boutons.add(appB);
		boutons.add(annule);
				
	//Ajoute les checkbox de sélection et les positionne dans la grille
		group.add(maj);
		group.add(min);
		choix.setLayout(grid);
		choix.add(label);
		choix.add(min);
		choix.add(emptyLabel);
		choix.add(maj);
		
	//Lien vers le modele
		data = sm; 
		
	//Lien vers le contrôleur
		app.addActionListener(sc);
		appB.addActionListener(sc);
		annule.addActionListener(sc);
		maj.addActionListener(sc);
		min.addActionListener(sc);
		
	//Bouton 'Annuler' grisé à l'initialisation
		if(disp.getText().isEmpty())
			annule.setEnabled(false);
		
	//Sélection par défaut de la checkbox 'Minuscule' 
		min.setSelected(true);
		
	//Affecte la taille de la fenêtre
		disp.setPreferredSize(new Dimension(150, 40));
		
	//Construit l'affichage dans la fenêtre
		this.add(disp, BorderLayout.CENTER);
		this.add(boutons, BorderLayout.NORTH);
		this.add(choix, BorderLayout.SOUTH);
	}

	
/********************* Met à jour la vue **********************************/
	
	public void majLabel() {
		
	//Si 'Minuscule' sélectionné, affiche le texte en minuscule
		if(min.isSelected()){
			maj.setSelected(false);
			disp.setText(data.getValue().toLowerCase());//affiche en minuscule
		}
		
	//Si 'Majuscule' sélectionné, affiche le texte en majuscule
		if(maj.isSelected()){
			min.setSelected(false);
			disp.setText(data.getValue().toUpperCase());//affiche en majscule
		}
		
	//Bouton 'Annuler' grisé si la zone texte est vide sinon bouton 'Annuler' devient valide
		if(disp.getText().isEmpty())
			annule.setEnabled(false);
		else
			annule.setEnabled(true);
		
	//Boutons 'Ajouter..' grisés si le texte entré dépasse 10 caractères
		if(disp.getText().length()<10){
			app.setEnabled(true);
			appB.setEnabled(true);
		}
		else
		{
			app.setEnabled(false);
			appB.setEnabled(false);
		}			
	}
}
