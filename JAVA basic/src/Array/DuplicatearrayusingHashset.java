package Array;

import java.util.HashSet;
import java.util.Set;

public class DuplicatearrayusingHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputarray = {1,2,3,5,5,7,8,8,8};
		int count =1;
		Set<Integer> duplicatenum=new HashSet<>();
		
		for(Integer number : inputarray ) {
			if(!duplicatenum.add(number)) {
			
				count ++;
				System.out.println(number+" is duplicate:"  + " "+count+" times");
			}
		}
	} 
}
