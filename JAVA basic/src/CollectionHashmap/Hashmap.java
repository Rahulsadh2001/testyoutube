package CollectionHashmap;

import java.util.HashMap;

// hashmap - collection in java use the concept Hashing and uses map interface
//Hashing- converting an object into an integer (creating optimized index for some object )
//so that searching/indexing an element would be faster
//Hashmap is a keyvalue pair combination

public class Hashmap {

	public static void main(String[] args) {
		 //HashMap<String, Integer> map = new HashMap<>();
		 HashMap<String,Integer> store=new HashMap<>();
	
		store.put("rahul", 56);
		store.put("karishma", 55);
		store.put("rocks", 54);
		store.put("saxena", 55);
		store.put("saxena", 25);
		
		
		System.out.println(store.get("saxena"));
	
                                                                                                    
	}

}
