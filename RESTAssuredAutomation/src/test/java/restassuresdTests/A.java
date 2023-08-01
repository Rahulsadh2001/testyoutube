package restassuresdTests;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "daabaac";
		char a;
		int count=0; 
		//String[] s= input.split("");
		for(int i=0;i<input.length();i++) {
			 if (input.charAt(i)=='a') {
				 
				count++;
			 }
		}
		System.out.println("the a char is repited "+count+"times");
		
	}}


