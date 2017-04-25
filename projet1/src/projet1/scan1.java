package projet1;

import java.util.Scanner;

public class scan1 {

	private Scanner sc;

	public void Scan() {
		sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un mot :");
		String str = sc.nextLine();
		System.out.println("Le mot entré est : " + str);
		char firstLetter = str.charAt(0);
		System.out.println("Sa première lettre est " + firstLetter);
		System.out.println("Et maintenant votre âge en chiffre !");
		int age = sc.nextInt();
		System.out.println("Vous avez " + age + " ans.");
		sc.nextLine(); // vider avant d'en lire une autre
		for(int i = 0; i <= age; i++){
			System.out.println("Tu as " + age + " ans " + i + " fois ! :O");
		}
	}

}
