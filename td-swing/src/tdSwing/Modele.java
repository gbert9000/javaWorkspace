package tdSwing;

import java.awt.Color;
import java.util.Observable;

class Modele extends Observable {   
    Color couleur1;
    Color couleur2;

    public Modele() {
	this.couleur1 = Color.BLUE;
	this.couleur2 = Color.RED;
    }

   void changeCouleur(int i) {
	if (i == 1) {
		if(couleur1 == Color.YELLOW)
		    couleur1 = Color.RED;
		else
		    couleur1 = Color.YELLOW;
	    }
	else {
		if(couleur2 == Color.YELLOW)
		    couleur2 = Color.RED;
		else
		    couleur2 = Color.YELLOW;
	    }
	setChanged();
	notifyObservers();
    }
}