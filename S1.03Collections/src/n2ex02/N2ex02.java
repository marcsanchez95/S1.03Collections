package n2ex02;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class N2ex02 {

	public static void main(String[] args) {
		
		Set<Restaurant2> restaurants = new TreeSet<>(Comparator.comparing(Restaurant2::getName).thenComparing(Comparator.comparingInt(Restaurant2::getScore).reversed()));
		Set<RestaurantSort2> restaurantSort2 = new HashSet<>();
		
		addRestaurant(restaurants, restaurantSort2, "Roca", 4);
		addRestaurant(restaurants, restaurantSort2, "Goikos", 5);
		addRestaurant(restaurants, restaurantSort2, "Goikos", 4);
		addRestaurant(restaurants, restaurantSort2, "Goikos", 3);
		addRestaurant(restaurants, restaurantSort2, "Roca", 4);
		addRestaurant(restaurants, restaurantSort2, "Roca", 4);
		addRestaurant(restaurants, restaurantSort2, "Abzan", 6);
		addRestaurant(restaurants, restaurantSort2, "Abzan", 9);
		addRestaurant(restaurants, restaurantSort2, "Abzan", 9);
		addRestaurant(restaurants, restaurantSort2, "Abzan", 4);
		addRestaurant(restaurants, restaurantSort2, "Abzan", 4);

		for (Restaurant2 restaurant : restaurants) {
			System.out.println(restaurant);
		}
	}
	public static void addRestaurant(Set<Restaurant2> restaurants, Set<RestaurantSort2> restaurantKeys, String name, int score) {
		RestaurantSort2 key = new RestaurantSort2(name, score);

		if (restaurantKeys.add(key)) {
			Restaurant2 restaurant = new Restaurant2(name, score);
			restaurants.add(restaurant);
		} else {
			System.out.println("Restaurant duplicated: " + name + ", score: " + score);
		}
	}
}