package medecine3;

public class Medecine3{
	public static void main(String[] args){
		Patient gilles=new Patient("Gilles");
		Maladie grippe=new Maladie("grippe");
		gilles.contracter(grippe);
		Medecin marc=new Medecin("Marc",23);
		marc.recevoir(gilles);
		Medicament aspirine=new Medicament("aspirine",10);
		marc.prescrire(aspirine);
		marc.demanderPaiement(gilles);
		gilles.payer(marc);
	}
}
