package n2ex02;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class N2ex02 {

	public static void main(String[] args) {

		Set<Restaurant2> restaurants = new TreeSet<>(Comparator.comparing(Restaurant2::getName).thenComparing(Restaurant2::getScore));

		addRestaurant(restaurants, "Roca", 4);
		addRestaurant(restaurants, "Goikos", 5);
		addRestaurant(restaurants, "Goikos", 4);
		addRestaurant(restaurants, "Goikos", 3);
		addRestaurant(restaurants, "Roca", 4);
		addRestaurant(restaurants, "Roca", 4);
		addRestaurant(restaurants, "Abzan", 6);
		addRestaurant(restaurants, "Abzan", 9);
		addRestaurant(restaurants, "Abzan", 9);
		addRestaurant(restaurants, "Abzan", 4);
		addRestaurant(restaurants, "Abzan", 4);
		
		System.out.println("[** Showing all the  restaurants **]");
		for (Restaurant2 restaurant : restaurants) {
			System.out.println(restaurant);
		}
	}

	public static void addRestaurant(Set<Restaurant2> restaurants, String name, int score) {

		Restaurant2 restaurant = new Restaurant2(name, score);

		if (restaurants.add(restaurant)) {
			System.out.println("Added the restaurant :"+restaurant.getName()+", with score of: "+ restaurant.getScore());

		} else {
			System.out.println("Restaurant duplicated: " + restaurant.getName() + ", with score of: " + restaurant.getScore());
		}
	}
}
