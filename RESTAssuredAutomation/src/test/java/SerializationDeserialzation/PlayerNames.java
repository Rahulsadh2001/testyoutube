package SerializationDeserialzation;

public class PlayerNames extends Teams{

	public static void main(String[] args) {
		
		try {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			System.out.println("result"+(a/b));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("invalid input format");
		}
		catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("can not devide by zero");
		}
		finally {
			// TODO Auto-generated catch block
			System.out.println("end of programm");
		}
	}

}
