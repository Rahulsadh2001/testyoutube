package SerializationDeserialzation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;




public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> names=Arrays.asList("kobe","Michael","Jo","Wil");
names.sort(new PlayerName());
System.out.println(names);
	}

}
