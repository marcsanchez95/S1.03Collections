package n1ex01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class N1ex01 {

	public static void main(String[] args) {	

			ArrayList<Month> months = new ArrayList<Month>();
			Month month1 = new Month("January");
			months.add(month1);
			Month month2 = new Month("February");
			months.add(month2);
			Month month3 = new Month("March");
			months.add(month3);
			Month month4 = new Month("April");
			months.add(month4);
			Month month5 = new Month("May");
			months.add(month5);
			Month month6 = new Month("June");
			months.add(month6);
			Month month7 = new Month("July");
			months.add(month7);

			// no s'afegeix a l'array.
			Month month8 = new Month("August");

			Month month9 = new Month("September");
			months.add(month9);
			Month month10 = new Month("October");
			months.add(month10);
			Month month11 = new Month("November");
			months.add(month11);
			Month month12 = new Month("December");
			months.add(month12);
			
			// recorre l'array i afegeix agost a la posicio que li correspon
			for (int i = 0; i <= 7; i++) {
				if (i == 7) {
					months.add(i, month8);
				}
			}
			//System.out.println(months);

			// Afageix-o els objectes de l'array a un HashSet que instancio.
			HashSet<Month> months2 = new HashSet<Month>();
			months2.addAll(months);
			
			//Comprobacio de que HashSet no permet afegir mesos amb el mateix nom
			months2.add((new Month("January")));
			
			//Recorro el hashSet amb un for each
			for (Month month : months2) {
				System.out.println(month);
			}
			System.out.println("");
			// recorro el hashSet amb un iterator
			Iterator<Month> it = months2.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}		
	}

}
