

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LiteratureOrganizerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LiteratureOrganizerTest
{
    /**
     * Default constructor for test class LiteratureOrganizerTest
     */
    public LiteratureOrganizerTest()
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
    public void positiveTestFindLiteratureByName()
    {
        LiteratureOrganizer literatu1 = new LiteratureOrganizer();
        Newspaper newspape1 = new Newspaper("Smp", "123", "smpp", 30, 5);
        literatu1.addLiterature(newspape1);
        assertSame(newspape1, literatu1.findLiteratureByName("Smp"));
    }

    @Test
    public void negativeTestFindLiteratureByName()
    {
        LiteratureOrganizer literatu1 = new LiteratureOrganizer();
        assertNull(literatu1.findLiteratureByName("smp"));
    }
}


