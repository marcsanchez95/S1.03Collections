package n1ex03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class N1ex03 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ArrayList<Integer> randomNums = new ArrayList<Integer>();
		String playerName;
		String result;
		//Cambiar el string que envia amb el show.Content al directori on es tingui l'archiu countries.txt
		String absolutePath = new File("./src/n1ex03/countries.txt").getAbsolutePath();
		HashMap<String, String> capitalCities = readText
				.showContent(absolutePath);
		
		randomNums = getRandomNumbers(capitalCities);		
		randomNums = getRandomNumbers(capitalCities);
		playerName = getPlayerName();
		result = game(playerName,capitalCities,randomNums);
		writeText(result);
		
		}
	
	public static ArrayList<Integer> getRandomNumbers(HashMap<String, String> capitalCities){
		ArrayList<Integer> randomNums = new ArrayList<Integer>();
		int randomIndex = 0;		
		int i = 0;
		
		while(i < 10 ) {
			Random random = new Random();			
			randomIndex = random.nextInt(capitalCities.size());
			randomNums.add(randomIndex);		
			i++;												
		}
		return randomNums;
	}
	public static String getPlayerName() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("** Welcome to the country and capital game ** \n        Please enter your player name: ");
		String playerName = sc.next();


		return playerName;

	}
	public static String game(String playerName,HashMap<String, String> capitalCities,ArrayList<Integer> randomNums) {
		Scanner sc = new Scanner (System.in);
		int score = 0;
		String result = null;
		ArrayList<String> capitals = new ArrayList<String>();
		System.out.println("Press enter to begin the game "+playerName);
		sc.nextLine();
		
		for (String key : capitalCities.keySet()) {
			capitals.add(key);			
		}
		for(Integer randomNum : randomNums) {
			System.out.println("Which is the capital of "+ capitals.get(randomNum));
			String response = sc.next();
			if(response.equalsIgnoreCase(capitalCities.get(capitals.get(randomNum)))) {
				System.out.println("Correct!. The capital of "+capitals.get(randomNum)+" is "+capitalCities.get(capitals.get(randomNum)));				
				score = score + 1;
				
			}else {
				System.out.println("Incorrect. The capital of: "+capitals.get(randomNum)+" is "+capitalCities.get(capitals.get(randomNum)));
			}
									
		}
		System.out.println("Thanks for play "+playerName+" your score is: "+score);
		result = "Thanks for play "+playerName+" your score is: "+score;
		return result;
		
		
	}
	//cambiar el directori del fileWriter a un valid.
	public static void writeText(String result) {
					
		try {
			String absolutePath = new File("./src/n1ex03/results.txt").getAbsolutePath();
			FileWriter archivo = new FileWriter(absolutePath);
			archivo.write(result);
			archivo.close();
			System.out.println("The data was successfully written to the file results.txt");
		} catch (IOException e) {
			System.out.println("An error occurred while writing to the file.");
			e.printStackTrace();
		}
	}

	}
