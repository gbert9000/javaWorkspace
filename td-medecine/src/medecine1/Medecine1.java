package medecine1;

public class Medecine1{
	public static void main(String[] args){
		Patient gilles=new Patient("Gilles");
		Maladie grippe=new Maladie("grippe");
		gilles.contracter(grippe);
	}
}
