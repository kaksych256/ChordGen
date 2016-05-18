/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chordgen;

import jm.music.data.Phrase;
import jm.music.data.Score;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gorgos
 */
public class CGSingletonTest {
    
    public CGSingletonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFactory method, of class CGSingleton.
     */
    @Test
    public void testGetFactory() {
        System.out.println("getFactory");
        CGSingleton expResult = null;
        CGSingleton result = CGSingleton.getFactory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNoteArray method, of class CGSingleton.
     */
    @Test
    public void testGetNoteArray() {
        System.out.println("getNoteArray");
        CGSingleton instance = null;
        NoteArray expResult = null;
        NoteArray result = instance.getNoteArray();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGenerateMelody method, of class CGSingleton.
     */
    @Test
    public void testGetGenerateMelody() {
        System.out.println("getGenerateMelody");
        CGSingleton instance = null;
        GenerateMelody expResult = null;
        GenerateMelody result = instance.getGenerateMelody();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhrase method, of class CGSingleton.
     */
    @Test
    public void testGetPhrase() {
        System.out.println("getPhrase");
        CGSingleton instance = null;
        Phrase expResult = null;
        Phrase result = instance.getPhrase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScore method, of class CGSingleton.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        CGSingleton instance = null;
        Score expResult = null;
        Score result = instance.getScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
