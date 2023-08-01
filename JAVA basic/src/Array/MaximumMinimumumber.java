package Array;

public class MaximumMinimumumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inputarray = {1,13,4,5,5,6,6,8};
		
		int Maxnumber =inputarray[0];
		int Minnumber =inputarray[0];
		for (int i=0;i<inputarray.length;i++) {
			if(Maxnumber<inputarray[i]) {
				Maxnumber=inputarray[i];
			}else if(Minnumber>inputarray[i]) {
				Minnumber=inputarray[i];
			
		}
		
	}
System.out.println("largest number"+Maxnumber);
System.out.println("smallest number"+Minnumber);
}
}