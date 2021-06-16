package p01;

public class Person {
	private long id;
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Person) {
			return (getId() == ((Person)obj).getId());
		}else{
			return false;
		}
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}	
