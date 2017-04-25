package projet1;

import java.util.Scanner;

public class convertCelFar {

	private Scanner valor;

	//public void main(String[] args) {
		// petit programme de converse de Celcius vers Fahrenheit et l'inverse
		System.out.println("SYSTEME DE CONVERTION DE DEGRET/FAHRENHEIT");
		valor = new Scanner(System.in);
		String wantRestart = "yes";
		
		while(wantRestart == "yes"){
		// Choix du type de convertion souhaité C = FvC & F = CvF
		System.out.println("Type de convertion");
		System.out.println("1 pour Cel vers Far || 2 pour Far vers Cel");
		boolean choice = false;
		int convertType = 0;
		// Boucle while pour forcer à rentrer un int 1 ou 2
		while(choice == false){
			convertType = valor.nextInt();
			if(convertType == 1){
				System.out.println("Vous avez choisi Celcius vers Fahrenheit.");
				choice = true;
			} else if(convertType == 2){
				System.out.println("Vous avez choisi Fahrenheit vers Celcius.");
				choice = true;
			} else {
				System.out.println("Veuillez choisir un mode de convertion valide.");
				choice = false;
			}
		}
		System.out.println("On va pouvoir commencer !");
		System.out.println("Rentre la valeur à convertir :");
		int deg = valor.nextInt();
		int res = 0;
		if(convertType == 1){
			// CEL VERS FAR
			res = ((9/5)*deg)+32;
			System.out.println(deg + "Celcius = " + res + "Fahrenheit");
		} else {
			// FAR VERS CEL
			res = ((deg-32)*5)/9;
			System.out.println(deg + "Fahrenheit = " + res + "Celcius");
		}
		System.out.println("Voulez vous recommencer ? (yes/no)");
		valor.nextLine();
		wantRestart = valor.nextLine();
		}
	//}

	public static double arrondi(double A, int B) {
		  return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
		}

}
