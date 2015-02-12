package medecine4;

public class Pharmacien {

	//variables
	private String nom;
	public Patient patient;
	public Medicament medicament;
	
	//constructeurs
	public Pharmacien (){
	}
	
	public Pharmacien (String nom){
	setNom(nom);
	System.out.println(getNom()+" est un pharmacien");
	}

	//méthodes
	public void setNom(String nom){
		this.nom=nom;
	}
	
	public String getNom(){
		return nom;
	}

	public void vendre(Patient patient, Medicament medicament){
		System.out.println(getNom()+" vend "+medicament.getNom()+" ("+medicament.getPrix()+" euros) à "+patient.getNom());
	}

}

