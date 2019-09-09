package Demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo2 {

	@Test(dependsOnMethods= {"test2","test3"})
	public void test1() {
		System.out.println("I am inside Test1");
	}

	@Test
	public void test2() {
		System.out.println("I am inside Test2");
	}
	
	@Test
	public void test3() {
		System.out.println("I am inside Test3");
	}
}
