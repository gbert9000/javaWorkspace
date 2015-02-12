package main;

import util.*;

/**
 * Programme principal.
 * @author Gilles
 *
 */
public class Main {
	
	/**
	 * Interdit l'instanciation de cette classe.
	 */
	private Main(){}

	/**
	 * 
	 * @param args Arguments de la ligne de commande (inutilisés).
	 * 
	 */
	public static void main(String[] args) {
		Util.joyeuxNoel();
		Util util=new Util();
		util.meilleursVoeux(2015);
	}

}
