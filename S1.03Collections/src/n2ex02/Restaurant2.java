package n2ex02;

import java.util.Objects;

public class Restaurant2 {
    private String name;
    private int score;

    public Restaurant2(String name, int score) {
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
	public int hashCode() {
		return Objects.hash(name, score);
	}

	@Override
	public boolean equals(Object restaurant2) {
		if (this == restaurant2)
			return true;
		if (restaurant2 == null || getClass() != restaurant2.getClass())
			return false;
		Restaurant2 that =   (Restaurant2) restaurant2;
		return score == that.score && Objects.equals(name, that.name);
	}


    @Override
    public String toString() {
        return "name: " + name + ", score: " + score;
    }
}
