package exo.heritage;

public class Man extends Human {

	public Man(String pName) {
		super(pName);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void Run(){
		System.out.println(name + " court vraiment très vite !");
	}

}
