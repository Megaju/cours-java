package exo.animals;

public class Chien extends Animal {

	public Chien(int poids, String couleur) {
		super(poids, couleur);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crier() {
		System.out.println("Ce chien est en train d'aboyer.");
	}

	@Override
	void court() {
		// TODO Auto-generated method stub
		System.out.println("Ce chien est en train de courir.");
	}
	
}
