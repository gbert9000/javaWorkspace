package medecine2;

public class Medecin {

	//variables
	private String nom;
	private int tarif;
	//private Patient patient;
	
	//constructeurs
	public Medecin(){		
	}
	
	public Medecin(String nom, int tarif){
		setNom(nom);
		setTarif(tarif);
		
		System.out.println(getNom()+" est un médecin, (tarif : "+getTarif()+" euros)");
		
	}
	
	//méthodes
	public void setNom(String nom){
		this.nom=nom;
	}

	public String getNom(){
		return nom;
	}

	public void setTarif(int tarif){
		this.tarif=tarif;
	}

	public int getTarif(){
		return tarif;
	}

	public void recevoir(Patient patient){
		System.out.println(getNom()+" recoit "+patient.getNom()+" en consultation");
	}

	public void demanderPaiement(Patient patient){
		System.out.println(getNom()+" demande "+getTarif()+" euros à "+patient.getNom());
	}
	
	
}
