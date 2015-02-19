package mvc;

import java.awt.*;

import javax.swing.*;

import mvc.StrModel;


/*la vue ou IHM */
public class StrGUI extends JPanel{
	
	// Attributs
	private static final long serialVersionUID = 1L;
	StrModel data;

	JPanel monPane1;
	JPanel monPane2;
	JPanel boutons;
	JButton open;
	JButton save;
	JButton affiche;
	JButton cancel;
	JTextArea saisie;
	JTextArea affichage;
	JLabel asaisir, aafficher;
	
	GridLayout grid1;
	
/******************** Construction de la vue *****************************/
	
	public StrGUI(StrModel sm, StrCont sc) {
		super(new BorderLayout());
		
	    //Initialisation GUI
		monPane1 = new JPanel();	//pour les Labels et TextArea
		monPane2 = new JPanel();	//pour les Labels et TextArea
		boutons = new JPanel(); //BorderLayout pour les boutons
		
		
		//Ajout des composants, Listeners
		
		//TextArea Saisie et Lecture
		asaisir = new JLabel("SAISIE UTILISATEUR");
		saisie = new JTextArea(15,25);
		aafficher = new JLabel("CONTENU DU FICHIER");
		affichage = new JTextArea(15,25);
		
		//Bouton ouvrir un fichier
		open = new JButton("Ouvrir");
		open.addActionListener(sc); //Lien vers le contrôleur
		
		//Bouton sauver dans un fichier
		save = new JButton("Sauvegarder");
		save.addActionListener(sc); //Lien vers le contrôleur

		//Bouton maj affichage contenu
		affiche = new JButton("Afficher");
		affiche.addActionListener(sc); //Lien vers le contrôleur

		//Bouton annuler qui efface le fichier d'entrée
		cancel = new JButton("Annuler");
		cancel.addActionListener(sc); //Lien vers le contrôleur
		
		//Lien vers le modele
		data = sm; 
		
		//Construit l'affichage dans la fenêtre
    	//grid1 = new GridLayout(4,1);    	
//		grid1.addLayoutComponent(getName(), aafficher);
//		grid1.addLayoutComponent(getName(), affichage);;
//		grid1.addLayoutComponent(getName(), asaisir);
//		grid1.addLayoutComponent(getName(), saisie);
//		monPane.setLayout(grid1);		

		monPane1.add(aafficher, BorderLayout.NORTH);
		monPane1.add(affichage, BorderLayout.SOUTH);
		monPane2.add(asaisir, BorderLayout.NORTH);
		monPane2.add(saisie, BorderLayout.SOUTH);
		
		this.add(monPane1, BorderLayout.NORTH);
		this.add(monPane2, BorderLayout.CENTER);

		boutons.add(open, BorderLayout.SOUTH);		
		boutons.add(save, BorderLayout.SOUTH);
		boutons.add(affiche, BorderLayout.SOUTH);
		boutons.add(cancel, BorderLayout.SOUTH);

		this.add(boutons, BorderLayout.SOUTH);
	}

	
/********************* Met à jour la vue **********************************/
	
		public void majAffichage() {
			//Si "Affiche" est cliqué, on affiche le texte saisit en plus du contenu du fichier
			affichage.append(saisie.getText());
		}
		
		public void majAll() {
			//Si "Affiche" est cliqué, on affiche le texte saisit en plus du contenu du fichier
			affichage.setText("");
			saisie.setText("");
		}
		
	}

