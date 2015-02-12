package medecine2;


public class Medecine2{
	public static void main(String[] args){
		Patient gilles=new Patient("Gilles");
		Maladie grippe=new Maladie("grippe");
		gilles.contracter(grippe);
		Medecin marc=new Medecin("Marc",23);
		marc.recevoir(gilles);
		marc.demanderPaiement(gilles);
		gilles.payer(marc);
	}
}
