package Demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo4RegularExpression {

	@Test(dependsOnGroups= {"smoke.*"})
	public void test1() {
		System.out.println("I am inside Test1");
	}

	@Test(groups= {"smoke2"})
	public void test2() {
		System.out.println("I am inside Test2");
	}
	
	@Test(groups= {"smoke3"})
	public void test3() {
		System.out.println("I am inside Test3");
	}

}
