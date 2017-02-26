package sampletry;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class Class2 {
  @Test
  public void f() {
	  System.out.println("class2 test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("class2 before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("class2 after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("class2 before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("class2 after class");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("class2 beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("class2 AfterTest");
	  
  }

}
