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
    public void testTranslateS2()
    {
    	assertTrue( "Fizz".equals(App.translateS2(33)) );
        assertTrue( "Buzz".equals(App.translateS2(5))  );
        assertTrue( "FizzBuzz".equals(App.translateS2(15)) );
        assertTrue( "Fizz".equals(App.translateS2(43)) );
        assertTrue( "Buzz".equals(App.translateS2(52)) );
        assertTrue( "FizzBuzz".equals(App.translateS2(53)) );
        assertTrue( "94".equals(App.translateS2(94)) );
    }

    /**
     * Rigourous Test :-)
     */
    public void testTranslateInterface()
    {
        assertTrue( "Fizz".equals(App.translateWithInterface(33))  );
        assertTrue( "Buzz".equals(App.translateWithInterface(5))  );
        assertTrue( "FizzBuzz".equals(App.translateWithInterface(15)) );
        assertTrue( "43".equals(App.translateWithInterface(43)) );
		assertTrue( "52".equals(App.translateWithInterface(52)) );
		assertTrue( "53".equals(App.translateWithInterface(53)) );
		assertTrue( "94".equals(App.translateWithInterface(94)) );
    }
    
    /**
     * Rigourous Test :-)
     */
    public void testTranslateInterfaceS2()
    {
    	assertTrue( "Fizz".equals(App.translateWithInterfaceS2(33)) );
        assertTrue( "Buzz".equals(App.translateWithInterfaceS2(5))  );
        assertTrue( "FizzBuzz".equals(App.translateWithInterfaceS2(15)) );
        assertTrue( "Fizz".equals(App.translateWithInterfaceS2(43)) );
        assertTrue( "Buzz".equals(App.translateWithInterfaceS2(52)) );
        assertTrue( "FizzBuzz".equals(App.translateWithInterfaceS2(53)) );
        assertTrue( "94".equals(App.translateWithInterfaceS2(94)) );
    }
}
