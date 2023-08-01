package CollectionSet;

import java.util.ArrayList;

public class Set {

	public static void main(String[] args) {
	//int count =0;
	int [] arraylist= {1,2,3,3,3,6,7,9,3,3,3,3,3};
	//int count=0;
	for(int i=0;i<arraylist.length;i++){
		for(int j=i+1;j<arraylist.length;j++) {
			
			if (arraylist[i]==arraylist[j]) {
				
				System.out.println("value is duluplicate " +j);
				//count++;
			}
				
		} 
	}}
}