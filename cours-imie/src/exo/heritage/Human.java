package exo.heritage;

public class Human {
	
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Human(String pName) {
		name = pName;
	}
	
	public void Walk() {
		System.out.println(name + " marche.");
	}
	
	public void Run() {
		System.out.println(name + " court.");
	}
	
}
