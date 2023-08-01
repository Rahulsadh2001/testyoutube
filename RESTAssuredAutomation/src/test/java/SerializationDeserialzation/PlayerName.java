package SerializationDeserialzation;

import java.util.Comparator;

public class PlayerName  implements Comparator<String>{
	
		
		public int compare (String s1, String s2) {
			return s2.length()- s1.length();
		}
	}

