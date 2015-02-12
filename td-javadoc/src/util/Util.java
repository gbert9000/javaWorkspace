package util;

/**
 * 
 * @author Gilles
 * 
 * Cette classe contient des m�thodes utiles pour la fin d'ann�e.
 *
 */
public class Util {
	
	/**
	 * Constructeur utile pour pouvoir ensuite souhaiter ses voeux.
	 */
	public Util(){}
		
	/**
	 * Permet de souhaiter Noël.
	 */
	public static void joyeuxNoel(){
		System.out.println("Joyeux No�l !");
	}
	
	/**
	 * Permet de souhaiter vos voeux.
	 * @param annee Ann�e suivante.
	 */
	public void meilleursVoeux(int annee){
		System.out.println("Meilleurs voeux pour "+annee+" !");
	}
		
}
