package n2ex01;
import java.util.HashSet;
import java.util.Set;

public class N2ex01 {

	public static void main(String[] args) {
		
	        Set<Restaurant> restaurants = new HashSet<>();

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
	        for (Restaurant restaurant : restaurants) {
	            System.out.println(restaurant);
	        }
	    }
	    public static void addRestaurant(Set<Restaurant> restaurants, String name, int score) {
	        Restaurant restaurant = new Restaurant(name, score);

	        if (restaurants.add(restaurant)) {
	        	System.out.println("Added the restaurant :"+restaurant.getName()+", with score of: "+ restaurant.getScore());
	        } else {
	            System.out.println("Restaurant duplicated: " + restaurant.getName() + ", score: " + restaurant.getScore());
	        }
	    }
	}
