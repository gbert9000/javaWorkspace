
public class Lieu {

	//variables
	private String nom;
	
	//constructeurs
	public Lieu (){
	}

	public Lieu (String nom){
		setLieu(nom);
		System.out.println(getLieu()+" est un lieu");
	}
	
	//méthodes
	public void setLieu(String nom){
		this.nom=nom;
	}
	
	public String getLieu(){
		return nom;
	}
	
}
