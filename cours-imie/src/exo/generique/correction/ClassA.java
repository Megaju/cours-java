package exo.generique.correction;

public class ClassA implements IEntity, Comparable<IEntity> {

	private Integer id;
	
	public ClassA(Integer id) { this.id = id; }

	@Override
	public int compareTo(IEntity o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
