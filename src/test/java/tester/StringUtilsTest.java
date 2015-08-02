package tester;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

  @Test
  public void testCheckIfEmpty() {
    final StringUtils su = new StringUtils();
    assertTrue(su.checkIfEmptyOrNull(""));
  }
  
  @Test
  public void testCheckNull() {
    final StringUtils su = new StringUtils();
    assertTrue(su.checkIfEmptyOrNull(null));
  }
  
  @Test
  public void testCheckNonNull() {
    final StringUtils su = new StringUtils();
    assertFalse(su.checkIfEmptyOrNull("hello"));
  }

}
