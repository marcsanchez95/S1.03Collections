package n1ex03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class readText {
		public static HashMap<String,String> showContent(String archive) throws FileNotFoundException, IOException { 
		   
		        HashMap<String, String> capitalCities = new HashMap<String, String>();
		        String cadena;
		        FileReader f = new FileReader(archive);
		        BufferedReader b = new BufferedReader(f);

		        while ((cadena = b.readLine()) != null) {
		            String[] parts = cadena.split(" ");
		            if (parts.length == 2) {
		                String country = parts[0];
		                String capital = parts[1];
		                capitalCities.put(country, capital);
		            }
		        }

		        b.close();
		        return capitalCities;
		    }
									
		}
