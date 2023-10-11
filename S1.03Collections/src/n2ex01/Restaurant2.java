package n2ex01;

public class Restaurant2 {
	private String name;
	private int score;
	


	public Restaurant2(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", score=" + score + "]";
	}
	

}
