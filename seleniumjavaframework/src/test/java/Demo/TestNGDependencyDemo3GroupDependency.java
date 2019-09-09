package Demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo3GroupDependency {

	@Test(dependsOnGroups= {"smoke1"})
	public void test1() {
		System.out.println("I am inside Test1");
	}

	@Test(groups= {"smoke1"})
	public void test2() {
		System.out.println("I am inside Test2");
	}
	
	@Test
	public void test3() {
		System.out.println("I am inside Test3");
	}

}
