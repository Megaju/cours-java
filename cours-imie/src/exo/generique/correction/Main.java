package exo.generique.correction;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static <T extends Comparable<IEntity>> T quiEstLePlusGrand(List<T> list){
		
		(List<T> list) {
			T result = list.get(0);
			for (int i = 1; i < list.size(); i++) {
				if (result.compareTo(list.get(0)) == -1) {
					result = list.get(i);
				}
			}
			return result;
		}
	}

}
