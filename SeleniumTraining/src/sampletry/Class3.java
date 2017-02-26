package sampletry;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Class3 {
  @Test
  public void f() {
	System.out.println("class3 Test");
  }
  @BeforeClass
  public void beforeClass(){
	  System.out.println("Class3 Before Class");
  }
  @AfterClass
  public void afterClass(){
	  System.out.println("Class3 After Class");
  }
  @BeforeMethod
  public void beforeMethod(){
	  System.out.println("Class3 Before Method");
  }
  @AfterMethod
  public void afterMethod(){
	  System.out.println("Class3 after method");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest");
	  
  }

}
