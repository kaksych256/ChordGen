/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chordgen;

import jm.music.data.Note;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import jm.JMC;
import jm.music.data.*;
import jm.util.*;

/**
 *
 * @author Gorgos
 */
public class NoteWrapperTest implements JMC {
    
    Note testNote;
    
    public NoteWrapperTest() {
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetNote() {
        
        Note CN4 = new Note(C4, SEMI_QUAVER, F);
        Note CNW4 = new NoteWrapper(CN4);
        
        String testNoteName = "C4";
        
        assertEquals(testNoteName, CNW4.getNote());
        System.out.println("@Test - testOneItemCollection");
    }
}
