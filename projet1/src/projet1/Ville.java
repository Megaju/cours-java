package projet1;

public class Ville {
	/*
	 * @String nomVille Stocke le nom de la ville
	 */
	protected String nomVille;
	/*
	 * @String nomPays Stocke le nom du pays de la ville
	 */
	protected String nomPays;
	/*
	 * @int nbreHabitants Stocke le nombre d'habitant dans la ville
	 */
	protected int nbreHabitants;
	
	// GETTEUR
	public String getNom(){
		return nomVille;
	}
	public String getPays(){
		return nomPays;
	}
	public int getNbreHab(){
		return nbreHabitants;
	}
	//SETTEUR
	public void setNom(String pNom){
		nomVille = pNom;
	}
	public void setPays(String pPays){
		nomPays = pPays;
	}
	public void setNbreHab(int nbH){
		nbreHabitants = nbH;
	}
	
	/*
	 * Constructeur par défaut
	 */
	public Ville(String pNom, String pPays, int nbH){
		System.out.println("Création d'une ville !");
		nomVille = pNom;
		nomPays = pPays;
		nbreHabitants = nbH;
	}
	
	
}
