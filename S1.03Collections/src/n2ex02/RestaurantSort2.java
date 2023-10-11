package n2ex02;

import java.util.Objects;

public class RestaurantSort2 {
	private String name;
	private int score;

	public RestaurantSort2(String name, int score) {
		this.name = name;
		this.score = score;
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
		RestaurantSort2 that = (RestaurantSort2) restaurant;
		return score == that.score && Objects.equals(name, that.name);
	}
}