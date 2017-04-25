package exo.animals;

public class Chat extends Animal {

	public Chat(int poids, String couleur) {
		super(poids, couleur);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void crier() {
		System.out.println("Ce chat est en train de miauler.");
	}

	@Override
	void court() {
		// TODO Auto-generated method stub
		System.out.println("Ce chat est en train de courir.");
	}

}
