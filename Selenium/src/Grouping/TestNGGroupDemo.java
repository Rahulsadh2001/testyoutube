package Grouping;

import org.testng.annotations.Test;
@Test(groups= {"testallclassgroup"})
public class TestNGGroupDemo {
@Test
	public void test1() {
		
		System.out.println("This is test1");
	}

@Test(groups= {"Sanity","smoke"})

public void test2() {
	
	System.out.println("This is test2");
}

@Test(groups= {"Sanity","regression"})
public void test3() {
	
	System.out.println("This is test3");
}

@Test
public void test4() {
	
	System.out.println("This is test4");
}
}
