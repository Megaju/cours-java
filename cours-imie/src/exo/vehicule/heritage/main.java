package exo.vehicule.heritage;

import java.util.ArrayList;
import java.util.List;

public class main {

	public main(String[] args) {
		// TODO Auto-generated method stub

		List<Vehicule> liste = new ArrayList<Vehicule>();
		
		liste.add(new Voiture("peugeot"));
		liste.add(new Camion("mercedes"));
	
		for (Vehicule item : liste) {
			System.out.println(
				String.format("Marque -> %s", item.getMarque()));
			item.setToZero();
			
			if (item instanceof Camion) {
				Camion camion = (Camion)item;
				camion.dechargerCamion();
				((Camion)item).dechargerCamion();
			}
		}
		
	}

}
