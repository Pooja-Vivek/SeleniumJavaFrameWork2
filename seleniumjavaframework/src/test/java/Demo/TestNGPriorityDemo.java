package Demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {

	@Test(priority = 3)
	public void one() {
		System.out.println("I am inside Test 1");

	}

	@Test(priority = 4)
	public void two() {
		System.out.println("I am inside Test 2");

	}

	@Test(priority = 2)
	public void three() {
		System.out.println("I am inside Test 3");

	}

}
