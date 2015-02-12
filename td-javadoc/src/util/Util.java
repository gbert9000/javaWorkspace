package util;

/**
 * 
 * @author Gilles
 * 
 * Cette classe contient des méthodes utiles pour la fin d'année.
 *
 */
public class Util {
	
	/**
	 * Constructeur utile pour pouvoir ensuite souhaiter ses voeux.
	 */
	public Util(){}
		
	/**
	 * Permet de souhaiter NoÃ«l.
	 */
	public static void joyeuxNoel(){
		System.out.println("Joyeux Noël !");
	}
	
	/**
	 * Permet de souhaiter vos voeux.
	 * @param annee Année suivante.
	 */
	public void meilleursVoeux(int annee){
		System.out.println("Meilleurs voeux pour "+annee+" !");
	}
		
}
