package medecine3;

public class Medicament {

	private String nom;
	private int prix;
	
	public Medicament(){
		
	}
	
	public Medicament(String nom, int prix){
		setNom(nom);
		setPrix(prix);
		System.out.println(getNom()+" est un médicament à "+getPrix()+" euros");
	}
	
	public void setNom(String nom){
		this.nom=nom;
	}
	
	public String getNom(){
		return nom;
	}
	
	public void setPrix(int prix){
		this.prix=prix;
	}
	
	public int getPrix(){
		return prix;
	}
}
