package exo.vehicule.heritage;

public abstract class Vehicule {
	
	private String marque;
	private String nom;
	private int vit;
	public Vehicule(String marque) {
		// TODO Auto-generated constructor stub
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getVit() {
		return vit;
	}
	public void setVit(int vit) {
		this.vit = vit;
	}
	
	public abstract void setToZero();
	
	
}
