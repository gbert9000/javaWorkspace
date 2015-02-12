package medecine4;

public class Maladie {

	//variables
	private String nom;
	
	//constructeurs
	public Maladie(){
	}
	
	public Maladie(String nom){
		setMaladie(nom);
		System.out.println(nom+" est une maladie");
	}
	
	//méthodes
	public String getMaladie(){
		return nom;
	}
	
	public void setMaladie(String nom){
		this.nom=nom;
	}
	
	
	
}
