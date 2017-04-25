package projet1;

public class sdz1 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ville rennes = new Ville("Rennes", "France", 200_000);
		System.out.println(rennes.getNom());
		
		Capitale cap = new Capitale("Paris", "France", 1_000_000);
		System.out.println(cap.getNom());
		
		String tamer = "T'as mère la tepu tu me pète les couilles ! ! ! !";
		int nbTamer = tamer.length();
		System.out.println("Dire une telle grossièreté prend autent de caractère... soit... " + nbTamer);
	}

}
