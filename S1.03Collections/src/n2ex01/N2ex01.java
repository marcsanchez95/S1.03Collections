package n2ex01;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class N2ex01 {

	public static void main(String[] args) {
		Set<Restaurant2> restaurants2 = new TreeSet<Restaurant2>(Comparator.comparing(Restaurant2::getName));		
		Set<String> names = new HashSet<>();
		Set<Integer> scores = new HashSet<>();

		addRestaurant(restaurants2, names, scores, "Roca", 4);
		addRestaurant(restaurants2, names, scores, "Goikos", 5);
		addRestaurant(restaurants2, names, scores, "Roca", 4);
		addRestaurant(restaurants2, names, scores, "Ruca", 7);
		addRestaurant(restaurants2, names, scores, "Abzan", 8);
		addRestaurant(restaurants2, names, scores, "Abzan", 5);
		addRestaurant(restaurants2, names, scores, "Abzan", 4);

		for (Restaurant2 restaurant2 : restaurants2) {
			System.out.println(restaurant2);
		}
	}

	public static void addRestaurant(Set<Restaurant2> restaurant2s, Set<String> names, Set<Integer> scores,String name, int score) {

		if (!names.contains(name) || !scores.contains(score)) {
			Restaurant2 restaurant2 = new Restaurant2(name, score);
			names.add(name);
			scores.add(score);
			restaurant2s.add(restaurant2);
		} else {
			System.out.println("Restaurant duplicated: " + name + ", score: " + score);
		}
	}	
}
