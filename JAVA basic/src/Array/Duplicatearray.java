package Array;

public class Duplicatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inputarray =  {1,2,2,2,2,2,2,5,5,5,2,7,8,8};
		
		for(int i=0;i<inputarray.length;i++) {
			for(int j=i+1;j<inputarray.length;j++)
			{
				if(inputarray[i]==inputarray[j]) {
					
				
							System.out.println(inputarray[i]);
				
				
			}
				}
			}
	}

}
