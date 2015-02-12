package medecine4;

public class Medecin {

	//variables
	private String nom;
	public int tarif;
	public Medicament medicament;
	public Patient patient;
	
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

	public Patient getPatient(){
		return patient;
	}
	
	public void setPatient(Patient patient){
		this.patient=patient;
	}
	
	public void recevoir(Patient patient){
		setPatient(patient);
		System.out.println(getNom()+" recoit "+patient.getNom()+" en consultation");
	}

	public void demanderPaiement(){
		System.out.println(getNom()+" demande "+getTarif()+" euros à "+patient.getNom());
	}
	
	public void prescrire(Medicament medicament){
		this.medicament=medicament;
		System.out.println(getNom()+" prescrit "+medicament.getNom()+" à "+patient.getNom());
	}
	
	
	
}
