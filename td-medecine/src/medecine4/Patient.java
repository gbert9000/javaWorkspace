package medecine4;

public class Patient {

	//variables
	private String nom;
	public Maladie maladie;
	public Medecin medecin;
	public Medicament medicament;
	public Pharmacien pharmacien;	
	
	//constructeurs
	public Patient(){
	}

	public Patient(String nom){
		setNom(nom);
		System.out.println(nom+" est un patient");
	}
	
	//méthodes
	public Maladie getMaladie(){
		return maladie;		
	}
	
	public void setMaladie(Maladie maladie){
		this.maladie=maladie;		
	}
	
	
	public String getNom(){
		return nom;
	}
	
	public void setNom(String nom){
		this.nom=nom;
	}
	
	public void contracter(Maladie maladie){
		setMaladie(maladie);
		System.out.println(getNom()+" contracte la maladie "+maladie.getMaladie());
	}
	
	public void payer(Medecin medecin){
		System.out.println(getNom()+" paye "+medecin.getTarif()+" à "+medecin.getNom());
	}
	
	public void payer(Pharmacien pharmacien, Medicament medicament){
		System.out.println(getNom()+" paie "+medicament.getPrix()+" euros à "+pharmacien.getNom());
	}
	
	public void guerir(){
		System.out.println(getNom()+" guérit de la maladie "+maladie.getMaladie());
	}
	
}
