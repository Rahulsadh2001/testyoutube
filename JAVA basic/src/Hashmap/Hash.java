package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
// How to save multiple value using hashmap
public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <Integer,List<String>> hashmap=new HashMap<Integer,List<String>>();
		
		List<String> dep =new ArrayList<String>();
		dep.add("ECE");
		dep.add("16/12/1992");
		dep.add("Rahul Sadh");
		
		List<String> dep1 =new ArrayList<String>();
		dep1.add("CSE");
		dep1.add("19/12/1992");
		dep1.add("Rohit verma");
		
		
		hashmap.put(1, dep);
		hashmap.put(2, dep1);
		
		System.out.println(hashmap.get(1));
		System.out.println(hashmap.get(2));
	
	System.out.println(	hashmap.keySet());
		
		
	
	}

}
