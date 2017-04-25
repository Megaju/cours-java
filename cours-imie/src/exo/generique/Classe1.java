package exo.generique;

public class Classe1 implements Comparable<IEntity>, IEntity {
	
	private Integer id ;

	@Override
	public int compareTo(IEntity arg0) {
		return arg0.getId().compareTo(this.getId());
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public Integer getId() {
		return this.id;
	}
}