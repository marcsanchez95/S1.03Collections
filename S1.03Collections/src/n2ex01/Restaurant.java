package n2ex01;

import java.util.Objects;

public class Restaurant {
    private String name;
    private int score;

    public Restaurant(String name, int score) {
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
	public boolean equals(Object restaurant) {
		if (this == restaurant)
			return true;
		if (restaurant == null || getClass() != restaurant.getClass())
			return false;
		Restaurant that =  (Restaurant) restaurant;
		return score == that.score && Objects.equals(name, that.name);
	}

    @Override
    public String toString() {
        return "name: " + name + ", score: " + score;
    }
}