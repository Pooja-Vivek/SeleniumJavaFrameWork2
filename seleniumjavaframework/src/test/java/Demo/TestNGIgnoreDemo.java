package Demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class TestNGIgnoreDemo {

	@Test
	public void test1() {
		System.out.println("I am inside Test1");
	}

	@Test
	@Ignore
	public void test2() {
		System.out.println("I am inside Test2");
	}

}
