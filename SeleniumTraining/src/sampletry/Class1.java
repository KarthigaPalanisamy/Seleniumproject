package sampletry;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Class1 {
  @Test
  public void f() {
	  System.out.println("Class1 Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("class1 Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Class1 After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Class1 Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Class1 After class");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("class1 before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("class1 after suite");
  }

}
