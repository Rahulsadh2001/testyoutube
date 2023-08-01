package String;

public class Charonstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input ="Rahul Sadh";
		char search='a';
		int count=0;
		for (int i=0;i<input.length();i++) {
			if (input.charAt(i)==search) {
				System.out.println("The index number is :" +i);
				count++;
				//System.out.println(search);
				
			}
					}
		System.out.println("The Character  "+ search+ " appear "+ count  +" times" );
	}
	

}
