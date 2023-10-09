package n1ex01;

public class Month {
	private String name;

	public Month(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Month [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
