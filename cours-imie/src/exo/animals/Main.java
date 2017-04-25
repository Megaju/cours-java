package exo.animals;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal chien = new Chien(42, "Gris");
		Animal chat = new Chat(33, "Noire");
		
		chien.crier();
		chat.crier();
		
		Object obj = new Chat(36, "Blanc");
		((Chat)obj).manger();
		
	}
	
	public <T> T quiEstLePlusGrand(List<T> liste) {
		return null;
		
	}

}
