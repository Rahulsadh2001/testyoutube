
public class StringtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="learn by rahul";
		
		char ar[]=new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			
			ar[i]=str.charAt(i);
			}
		for(char c: ar )
			System.out.println(c);
		
	}}