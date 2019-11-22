package com.bnr;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Calculator.
 */
public class CalculatorTest 
    extends TestCase
{
    Calculator calc = new Calculator();
    
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CalculatorTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CalculatorTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testCalculator()
    {
        assertTrue( true );
    }

    public void testAdd()
    {
	assertEquals(4, calc.add(2,2));
    }

    public void testSubtract()
    {
	assertEquals(4, calc.subtract(6,2));
	assertEquals(0, calc.subtract(2,2));
	assertEquals(-4, calc.subtract(0,4));
    }

    //    public void testBreak() { assertEquals(4, 3)); }

    // public void testSubtract2()
    // {
    // 	assertEquals(4, calc.subtract(6,1));
    // }

}
