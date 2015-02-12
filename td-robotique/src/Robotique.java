public class Robotique{
	public static void main(String[] args){
		Robot bob=new Robot("Bob");
		Lieu bureau=new Lieu("bureau");
		bob.allerDans(bureau);
		bob.nettoyer();
		Lieu cuisine=new Lieu("cuisine");
		Robot max=new Robot("Max",cuisine);
		max.nettoyer();
		Robot.ranger();
	}
}
