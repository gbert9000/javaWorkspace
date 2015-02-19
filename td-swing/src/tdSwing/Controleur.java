package tdSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Controleur implements ActionListener {
    Modele modeleControle;
    Vue laVue;
    int num; 

    Controleur(Modele leModele, Vue laVue) {
	this.modeleControle = leModele;
	this.laVue = laVue;
	laVue.bouton1.addActionListener(this);
	laVue.bouton2.addActionListener(this);
    }
    
    
    public void actionPerformed(ActionEvent e) {
	if(e.getSource() == laVue.bouton1)  modeleControle.changeCouleur(2);
	else  modeleControle.changeCouleur(1);
    }
 }