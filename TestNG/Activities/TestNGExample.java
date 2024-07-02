package examples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNGExample {
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass");
  }
  
  @Test
  public void f() {
	  System.out.println("Test");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod");
  }

}
