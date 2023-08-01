package TestNGAnnotation;

import org.testng.annotations.Test;

public class D {

	
	@Test
	public void PaymentDetails(){
	   System.out.println("runPaymentDetails");
	}
	@Test(invocationCount=5)
	public void LoginAdmin(){
	   System.out.println("run invocationCount multiple times");
	}
	@Test
	public void LeaseDetails(){
	   System.out.println("run LeaseDetails");
	}
	
}
