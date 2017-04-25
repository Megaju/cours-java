package projet1;

public class TypeDeVariableEtc {
	System.out.print("Hello World ! \n");
	System.out.print("My name is Megaju !");
	
	// Types de variables
	
	/*
	 * Comprise entre -128 et 127
	 */
	byte temperaure = 64;
	
	/*
	 * Comprise entre -32768 et 32767
	 */
	short vitesseMax = 32000;
	
	/*
	 * Comprise entre -2*109 à 2*109 (c'est pas mal)
	 */
	int temperatureSoleil = 15600000;
	
	/*
	 * Comprise entre −9×1018−9×1018  à 9×1018 (Là ! Là on est bien !)
	 */
	long anneeLumiere = 9460700000000000L; // On ajout L à la fin pour le compilateur
	
	/*
	 * De type float (4octets)
	 */
	float pi = 3.141592653f;
	
	/*
	 * Egal au type float mais avec plus de chiffre (8octets)
	 */
	double nombre = 3.8888888888888888888888888888888888889d;
	
	// !!!!!!!!!! AFFICHAGE DES NOMBRES DE FACON "JOLIE"
	short vitesseMin = 3_900; // le nombre d'underscore n'a pas d'importance
	
	/*
	 * Contient un caractère
	 */
	char name = 'J';
	
	/*
	 * Boolean
	 */
	boolean reponse = true; // or false...
	
	/*
	 * Type string (longue chaîne de caractère)
	 */
	//Première méthode de déclaration
	String phrase;
	phrase = "Titi et Grosminet";

	//Deuxième méthode de déclaration
	String str = new String();
	str = "Une autre chaîne de caractères";

	//Troisième méthode de déclaration
	String string = "Une autre chaîne";

	//Quatrième méthode de déclaration
	String chaine = new String("Et une de plus !");
}
