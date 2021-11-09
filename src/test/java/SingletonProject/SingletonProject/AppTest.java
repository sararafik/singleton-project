package SingletonProject.SingletonProject;

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
    
    public void TestApp(){
    	Singleton instanceOne = Singleton.getInstance();
		System.out.println("instanceOne"+instanceOne);
		Singleton instanceTwo = Singleton.getInstance();
		System.out.println("instanceTwo"+instanceTwo);
		assertEquals(instanceOne, instanceOne);	
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
    public void testApp()
    {
        assertTrue( true );
    }
}
