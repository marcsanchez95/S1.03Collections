package n1ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class N1ex02 {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<Integer>();

		nums.add(2);
		nums.add(7);
		nums.add(8);
		nums.add(4);

		List<Integer> numReversal = new ArrayList<Integer>();

		ListIterator<Integer> it =  nums.listIterator(nums.size());

		/*for (int i = num.size()-1; i >= 0; i--) {
			numReversal.add(num.get(i));

		}*/
		while(it.hasPrevious()) {
			numReversal.add(it.previous());			
		}
		System.out.println(numReversal);	
	}

}
