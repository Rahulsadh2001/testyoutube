package ReverseStringvalue;

public class R {

	public static void main(String[] args) {
		
		String name="Rahul#$%#$55Interview";
		
		String[] c=name.split(name);
		String search="#";
	for (int i=0;i<c.length;i++)
if (c[i]==search) {
	System.out.println("found special char"+c[i]);
		}

	}}
