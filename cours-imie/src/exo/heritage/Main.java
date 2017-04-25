package exo.heritage;

public class Main {

	private static Man man1;
	private static Man man2;
	private static Woman woman1;
	private static Woman woman2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ÉNONCÉ
		 * On a des hommes et des femmes qui sont des humains.
		 * Les deux peuvent marcher et courirs.
		 * Seule la femme peut être enceinte.
		 */
		
		man1 = new Man("Julien");
		man2 = new Man("Clément");
		woman1 = new Woman("Émeraude", false);
		woman2 = new Woman("Oraure", true);
		
		man1.Walk();
		man2.Run();
		woman1.Pregnant();
		woman1.Walk();
		woman2.Pregnant();
		
	}

}
