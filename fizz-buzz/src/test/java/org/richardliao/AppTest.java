package org.richardliao;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testTranslate()
    {
        assertTrue( "Fizz".equals(App.translate(33))  );
        assertTrue( "Buzz".equals(App.translate(5))  );
	assertTrue( "FizzBuzz".equals(App.translate(15)) );
	assertTrue( "43".equals(App.translate(43)) );
	assertTrue( "52".equals(App.translate(52)) );
	assertTrue( "53".equals(App.translate(53)) );
	assertTrue( "94".equals(App.translate(94)) );
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testTranslate1()
    {
	assertTrue( "Fizz".equals(App.translate1(33)) );
        assertTrue( "Buzz".equals(App.translate1(5))  );
	assertTrue( "FizzBuzz".equals(App.translate1(15)) );
	assertTrue( "Fizz".equals(App.translate1(43)) );
	assertTrue( "Buzz".equals(App.translate1(52)) );
	assertTrue( "FizzBuzz".equals(App.translate1(53)) );
	assertTrue( "94".equals(App.translate1(94)) );
    }
}
