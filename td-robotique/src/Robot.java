
public class Robot {

	//variables
	private String nom;
	public Lieu lieu;
	private static int nbRobot;
	
	//constructeurs
	public Robot(){
	}
	
	public Robot(String nom){
		setNom(nom);
		System.out.println(getNom()+" est un robot");
		nbRobot++;
	}

	public Robot(String nom, Lieu lieu){
		setNom(nom);
		setLieu(lieu);
		System.out.println(getNom()+" est un robot");
		System.out.println(getNom()+" est déjà dans "+lieu.getLieu());
		nbRobot++;
	}
	
	
	
	//méthodes
	public void setNom(String nom){
		this.nom=nom;
	}
	
	public String getNom(){
		return nom;
	}

	public void setLieu(Lieu lieu){
		this.lieu=lieu;
	}
		
	public void allerDans(Lieu lieu){
		System.out.println(getNom()+" va dans "+lieu.getLieu());
		setLieu(lieu);
	}
	
	public void nettoyer(){
		System.out.println(getNom()+" nettoie "+lieu.getLieu());
	}
	
	public static void ranger(){
		System.out.println(nbRobot+" est le nombre de robots rangés");
		nbRobot=0;
	}
	
}
