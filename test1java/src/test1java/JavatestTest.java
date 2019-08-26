package test1java;

import static org.junit.jupiter.api.Assertions.*;

public class JavatestTest extends junit.framework.TestCase{
	public void testAddingTwoPositiveIntegers() throws Exception {
        int expected = 11;
        int actual = new Javatest().add(4, 7);
        assertEquals(expected, actual);
    }
  
    public void testAddingTwoNegativeIntegers() throws Exception {
        int expected = -11;
        int actual = new Javatest().add(-4, -7);
        assertEquals(expected, actual);
    }
  
    public void testAddingNegativeIntegerToPositiveInteger() throws Exception {
        int expected = -3;
        int actual = new Javatest().add(4, -7);
        assertEquals(expected, actual);
    }
}