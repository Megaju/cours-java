package exo.vehicule.heritage;

public class Camion extends Vehicule {
	
	public Camion(String marque) {
		super(marque);
	}
	
	@Override
	public void setToZero() {
		// TODO Auto-generated method stub
		System.out.println("Le camion est à l'arrêt.");
	}
	
	public void dechargerCamion() {
		System.out.println("Le camion est déchargé");
	};
	
}
