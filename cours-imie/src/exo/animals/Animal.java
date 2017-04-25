package exo.animals;

abstract class Animal {
	
	protected int poids;
	protected String couleur;
	
	public int getPoids() {
		return poids;
	}
	
	public String getCouleur() {
		return couleur;
	}
	
	public int setPoids(int poids) {
		return this.poids = poids;
	}
	
	public String setCouleur(String couleur) {
		return this.couleur = couleur;
	}
	
	public Animal(int poids, String couleur) {
		this.setPoids(poids);
		this.setCouleur(couleur);
	}
	
	public void manger() {
		System.out.println("Est en train de manger.");
	}
	
	public void boire() {
		System.out.println("Est en train de boire.");
	}
	
	abstract void court();
	
	abstract void crier();
	
}
