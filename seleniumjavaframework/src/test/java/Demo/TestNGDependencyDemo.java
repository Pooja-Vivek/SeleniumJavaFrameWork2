package Demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {

	@Test(priority=2)
	public void test1() {
		System.out.println("I am inside Test1");
	}

	@Test(dependsOnMethods= {"test1"}, priority=1)
	public void test2() {
		System.out.println("I am inside Test2");
	}
}
