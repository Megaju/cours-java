package exo.heritage;

public class Woman extends Human {

	boolean isPregnant;
	
	public Woman(String pName, boolean isPregnant) {
		super(pName);
		// TODO Auto-generated constructor stub
		this.isPregnant = isPregnant;
	}
	
	@Override
	public void Walk(){
		System.out.println(
				"La femme " + name + " est en train de marcher.");
	}
	
	public void Pregnant() {
		if (isPregnant == true) {
			System.out.println(name + " est enceinte.");
		} else {
			System.out.println(name + " n'est pas enceinte.");
		}
		
	}

}
