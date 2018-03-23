

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ShipTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ShipTest
{
    /**
     * Default constructor for test class ShipTest
     */
    public ShipTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void initialise()
    {
        Ship ship2 = new Ship(5);
        assertEquals(ShotStatus.MISS, ship2.getStatus(3));
    }
}

