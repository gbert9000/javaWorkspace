package tdSwing;

public class DeuxBoutonsMVC {
	 public static void main(String[] args) {
			Modele leModele = new Modele();
			Vue laVue = new Vue();
			Controleur leControleur = new Controleur(leModele, laVue);
			leModele.addObserver(laVue);
		    }
}
