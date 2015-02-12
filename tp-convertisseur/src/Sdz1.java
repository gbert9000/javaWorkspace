import java.util.Scanner;

public class Sdz1 {

	public static void main(String[] args) {
		// TODO Méthode main

	float temperature=0;
	float resultat=0;
	char reponse;
	int mode;
	
	System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT");	
	System.out.println("-------------------------------------------------");	
	
	do{ //boucle principale
		mode=0;
		System.out.println("Choisissez le mode de conversion :");
		System.out.println("1 - Convertisseur Celsius - Fahrenheit");
		System.out.println("2 - Convertisseur Fahrenheit - Celsius");
		Scanner sc = new Scanner(System.in);
		mode=sc.nextInt();
		if (mode == 1){
			System.out.println("Température à convertir :");
			//Scanner sc = new Scanner(System.in);
			temperature=sc.nextFloat();
			//calcul Fahrenheit
			resultat=((9/5)*temperature)+32;
			System.out.println(temperature+" °C correspond à "+arrondi(resultat,1)+" °F");
		}else{
			System.out.println("Température à convertir :");
			//Scanner sc3 = new Scanner(System.in);
			temperature=sc.nextFloat();
			//calcul Celsius 
			resultat=((temperature-32)*5)/9;
			System.out.println(temperature+" °F correspond à "+arrondi(resultat,1)+" °C");
		}
		
		System.out.println("Souhaitez-vous convertir une autre température ? (O/N)");
		//Scanner sc4 = new Scanner (System.in);
		reponse = sc.nextLine().charAt(0);
		
	}while(reponse=='O');
	
		System.out.println("Au revoir !");
	
	}



	public static double arrondi(double A, int B) {
		return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10,B);
	}

}