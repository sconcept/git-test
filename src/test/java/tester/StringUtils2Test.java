package tester;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtils2Test {

  @Test
  public void testFail() {
      System.out.println("fail");
      //      fail("fail");
      
       final StringUtils su = new StringUtils();
      assertFalse(su.checkIfEmptyOrNull("hello"));
  }

}
