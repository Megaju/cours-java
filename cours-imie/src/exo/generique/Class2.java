package exo.generique;

public class Class2 implements Comparable<Integer> {

	private Integer id;
	
	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		int result = id.compareTo(o);
		return result;
	}

}
